package com.cg.hbm.exceptionhandling;



public class RoomDetailsNotFoundException extends RuntimeException{

	/**
	 * 
	 */

	public RoomDetailsNotFoundException( String errorMessage) {
		super(errorMessage);
		}

}