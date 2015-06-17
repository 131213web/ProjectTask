# web应用设计
## 交互设计
+ 交互设计
    + 全局导航：位于网页的头部，采用站点经常的主要功能作为全局导航。如歌手、音乐推荐、热门分享歌单、我的音乐天地。还有搜索条，可以按照歌曲名、专辑名、歌手名进行搜索。
    ![全局导航](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/head.png "全局导航")
    音乐推荐：可以按照
    ![全局导航](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/recommend.png "音乐推荐")
    + 用户的注册登录：采用弹出对话框的形式进行操作在用户完成登录操作之后在网页的右上角会显示出用户的用户名，等级等基本信息。若是新用户点击注册则跳转至新的网页进行信息采集。
    + 
    ![test](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/login.PNG "sdf")
    + 音乐播放器：用户点击播放器播放按钮，进行音乐播放，再点击就暂停播放，同时还有上一首，下一首的两个按键，用户点击就能进行切歌，拖动音乐进度条可以将歌曲时间拖动到你需要的地方。
    ![test](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/player.PNG "sdf")
    + 首页图片展示：点击首页上的音乐图片将直接跳转到该音乐版面，用户可以查看详细信息或者进一步操作。
    ![test](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/display.PNG "sdf")
    + 音乐分类：点击代表音乐分类的图片进入相应的音乐分区，
    ![test](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/category.PNG "sdf")
    + 评价：用户可以通过点击音乐下面的星来表示喜欢这首歌，系统将会根据每首歌的星数来排定歌曲的排行榜
    ![test](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/evaluate.PNG "sdf")

## 展示设计
#####主页展示图
![主页展示图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/homepage.png "sdf")
#####注册展示图
![注册展示图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/zhuce1.png "sdf")
#####登录展示图
![登录展示图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/denglu1.png "sdf")
#####个人主页展示图
![个人主页展示图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/personalpage.png "sdf")
## 内容设计
#####总体架构图
![总体架构图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/Content_01.png "function")
#####1. 组织内容
   总体采用的是层次结构：在主界面上显示登录注册，播放音乐，排行榜，推荐，评价，分类以及友情链接。在登录成功状态下可进行音乐上传。在分类下分别有流派，语种&地域，年代，主题&风格。在友情链接点击下，可以链接到当前主流的音乐网站。
#####2. 导航系统
   导航系统主要是为用户的浏览服务，使用户知道他们在浏览该网站。无论用户在网页的哪个界面，在网页的顶端显示用户登录信息，以及用户当前位置。
   全局导航，网站主界面将整个版面设计成若干区域，左侧为链接栏，连接到当前主流的音乐网站。其他功能均能使用户深入到应用的主要内容域，并可从应用返回到主界面。
　 局部导航，作为全局导航的补充。在音乐分类下依次还有流派，语种&地域，年代，主题&风格。这样用户就可以在一个内容里按层次浏览信息。

## 功能设计
#####总体功能设计图
![总体功能设计图](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/Functional%20Design_1.PNG "function")
#####一.用户管理模块
![用户管理模块](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/Functional%20Design_2.jpg "function")
如图所示：
若用户没有注册，可点击“注册”进行相关个人信息的填写，否则点击“登录”进行登录。如果用户忘记密码，可根据用户之前的相关信息来找回密码。
用户登陆后，可进行个人信息的补充或删除。
在任何时候，用户点击“退出”，可退出登录。
#####二.用户管理模块
###### (1).用户未登陆状态
![音乐管理模块](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/Functional%20Design_3.PNG "function")
###### (2).用户登陆状态
![音乐管理模块](https://github.com/131213web/ProjectTask/blob/master/tasks/task06/Functional%20Design_4.PNG "function")
