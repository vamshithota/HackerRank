package com.java.revise;

public class Bird extends Animal{
	private boolean walks;
	public Bird() {
        super("bird");
    }

    public Bird(String name, boolean walks) {
        super(name);
        setWalks(walks);
    }
    public Bird(String name) {
        super(name);
    }
	@Override
	public String eats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWalks() {
		return walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}

}
