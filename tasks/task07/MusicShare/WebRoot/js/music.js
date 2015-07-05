// JavaScript Document
var myMusic = null;
var MyMusic = function(){
	var _this = this;
	var musicBox_H = document.getElementById("musicBox"); 
	var people = "images/people/";
	//音乐列表
	var musicFiles=[new MusicObj("铃声-心语星愿(钢琴曲)","musics/铃声-心语星愿(钢琴曲).mp3","EXO-K","MAMA",people+"EXO-K.jpg",0,1),
					new MusicObj("尚雯婕-候鸟","musics/尚雯婕-候鸟.mp3","EXO-K","MAMA",people+"EXO-K.jpg",0,1),
					new MusicObj("逃跑计划-夜空中最亮的星","musics/逃跑计划-夜空中最亮的星.mp3","Super Junior","Sexy, Free & Single",people+"Super Junior.jpg",0,0),
					new MusicObj("徐良-坏女孩(铃声)","musics/徐良-坏女孩(铃声).mp3","4 Minute","4 Minute For Muzik Cd",people+"4 Minute.jpg",1,0),
					new MusicObj("张韶涵-隐形的翅膀(正版)","musics/张韶涵-隐形的翅膀(正版).mp3","王绎龙","电音之王",people+"wyl.jpg",0,0)
　　];
	//播放模式 1-全部循环 2-单曲循环  3-随机播放
	var playMode = 1;
	//当前音乐播放的下标
	var index = -1;
	var length = musicFiles.length;
	var playMode_H = $("#playMode");
	var musicList_H = $("#musicList");
	var playMsg_H = $("#playMsg");
	var name = $("#name");
	var author = $("#author");
	var CD = $("#CD");
	var picInfo = $("#picInfo");
	var pop =$("#pop");
	var playMsg = null;
	_this.fristMusic = function(){
		index = 0;
		_this.play();
	}
	_this.playOrPause=function(){
		pop.addClass("Gray");
		var popVal = pop.attr("imgVal");
		if(popVal == 0){
			pop.attr("src","image/pause.png");
			pop.attr("title","点击播放");
			pop.attr("imgVal","1");
			musicBox_H.pause();
		}else{
			pop.attr("src","image/play.png");
			pop.attr("title","点击暂停");
			pop.attr("imgVal","0");
			musicBox_H.play();
		}
		
	}
	_this.end = function(){
		index = length -1;
		_this.play();
	}
	_this.lastMusic = function(){
		if(index == 0){
			index = length-1; 
		}else{
			index --;
		}
		_this.play();
	}
	_this.loadMusic = function(){
		for(var i in musicFiles){
			var html = "<li>"+musicFiles[i].name;
			if(musicFiles[i].hot == 1){
			html+="<img src='image/hot.gif'/>";
			}
			if(musicFiles[i].newSong == 1){
				html+="<img src='image/new.gif'/>";
			}
			html+= "</li>";
			musicList_H.append(html);
	　　}
	};
	_this.nextMusic = function(){
		var currentMusic = null;
		
		switch(parseInt(playMode)){
			case 1:
			index ++;
			if(index>=length){
				index = 0;
			}
			break;
			case 2:
			if(index == -1){
				index = 0;
			}
			break;
			case 3:
			index = Math.floor(Math.random()*length);
			
			break;
		}
		_this.play();
	};
	_this.loadInfo = function(){
		name.text(musicFiles[index].name);
		author.text(musicFiles[index].author);
		CD.text(musicFiles[index].CD);
		picInfo.attr("src",musicFiles[index].people);
	};
	_this.play = function(){
		currentMusic = musicFiles[index];
		playMsg_H.text(musicFiles[index].name+"【"+musicFiles[index].author+"】");
		$(musicBox_H).attr("src",musicFiles[index].url);
		$("#musicList").children().each(function(i){
				$($("#musicList").children().get(i)).removeClass("liOn");
		}); 
		$($("#musicList").children().get(index)).addClass("liOn");
		_this.loadInfo();
		musicBox_H.play();
	};
	_this.init = function(){
		_this.loadMusic();
		var songheight = $("#songs").height();
		$("#infos").css("height",songheight+"px");
		playMode_H.change(function(){
			playMode = playMode_H.val();
		});
	};
}
$().ready(function(){
	myMusic = new MyMusic();
	myMusic.init();
	myMusic.nextMusic();
});
//音乐对象
function MusicObj(name,url,author,cd,people,hot,newSong){
	var _this = this;
	this.name = name;
	this.url = url;
	this.author = author;
	this.CD = cd;
	this.people = people;
	this.hot = hot;
	this.newSong= newSong;
}