package com.java.practise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       // number of lists to be created
	       int n = scanner.nextInt();
	        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	        //adding of elements in list
	        for(int i=0;i<n;i++){
	            // number of elements to be present in one arraylist
	            int d = scanner.nextInt();
	            ArrayList<Integer> row = new ArrayList<Integer>(d);
	            for(int j=0;j<d;j++){
	                int value = scanner.nextInt();
	               row.add(value);
	            }
	            list.add(row);
	        }
	        //getting quries
	        int q = scanner.nextInt();
	        for(int i=0;i<q;i++){
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	        try{
	             System.out.println(list.get(x-1).get(y-1));
	        }catch(IndexOutOfBoundsException  e){
	             System.out.println("ERROR!");
	        }
	        }
	        
	
	}
	
}
