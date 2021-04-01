package com.java.revise;

public class Goat extends Animal implements Locomotion{
	public Goat(String name) {
		super(name);
	}
	public Goat() {
		
	};
	private String name;

	/*
	 * public Goat(String name) { this.name = name; }
	 * 
	 * public Goat() { // TODO Auto-generated constructor stub }
	 */
	@Override
	public String getLocomotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String eats() {
		// TODO Auto-generated method stub
		return null;
	}

}
