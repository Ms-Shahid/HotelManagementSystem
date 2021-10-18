package com.cg.hbm.exceptionhandling;



public class RoomDetailsNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RoomDetailsNotFoundException( String errorMessage) {
		super(errorMessage);
		}

}