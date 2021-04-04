package com.java.practise;

public class SingletonChallenge {
// writing 2 approaches
	
	//1. create private constructor
	
	private SingletonChallenge() {};
	
	// create new instance and only one
	
	private static SingletonChallenge singletonInstance;
	
	public static SingletonChallenge getSingletonInstance() {
		if(singletonInstance == null) {
			synchronized (SingletonChallenge.class) {
				if(singletonInstance== null) {
					singletonInstance = new SingletonChallenge();
				}
			}
		}
		return singletonInstance;
	}
	// alternate apporach
	
	private static class SingletonHolder{
		private static final SingletonChallenge INSTANCE = new SingletonChallenge(); 
	}
	public static SingletonChallenge getInstance() {
    	return SingletonHolder.INSTANCE;
    }
}
