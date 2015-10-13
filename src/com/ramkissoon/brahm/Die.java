package com.ramkissoon.brahm;

import java.util.Random;


/**
 * 
 * Filename: Die.java
 * @author Brahmadut Ramkissoon
 * Created Date: Oct 13, 2015
 * Description: represents a die with a randomly assigned side value
 * 				returns it's value
 */
public class Die {
	private int _side;
	public static final int MAX_SIDES = 6;
	
	/**
	 * Constructor
	 */
	public Die(){
		Random rand = new Random();
		// set range between 1 - 6
		this._side = rand.nextInt(MAX_SIDES) + 1;
		
	}
	
	/**
	 * Getter Method returns value of side
	 */
	public int getSideValue(){
		return _side;
	}

}
