package com.musicshare.exception;

public class MsgException extends RuntimeException {

	public MsgException() {	
	}
	
	public MsgException(String message) {
		super(message);
	}
}
