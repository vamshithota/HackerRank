package com.java.revise;

public class GenericClassEg<T> {
	T t;
	
	public void add(T t) {
		this.t =t;
	}
	public T get() {
		return this.t;
	}
	
	public static void main(String[] args) {
		GenericClassEg<Integer> gc = new GenericClassEg<Integer>();
		gc.add(20);
		System.out.println(gc.get());
		GenericClassEg<String> sgc = new GenericClassEg<String>();
		sgc.add("vamshi");
		System.out.println(sgc.get());
		
	}
	
}
