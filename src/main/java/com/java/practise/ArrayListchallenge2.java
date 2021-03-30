package com.java.practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListchallenge2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> alist = new ArrayList<Integer>();
        for(Integer inte: alist) {
        	if(inte instanceof Integer) {
        		
        	}
        }
		/*
		 * alist.sort(new Comparator<Integer>(){
		 * 
		 * @Override public int compare(Integer o1, Integer o2) {
		 * 
		 * }
		 * 
		 * 
		 * });
		 */        for(int i=0;i<length;i++){
            Integer numb = scanner.nextInt();
            alist.add(numb);
        }
        int quires = scanner.nextInt();
        for(int i =0;i<=quires;i++){
           String j = scanner.nextLine();
           j = j.trim();
           if(j.equals("Insert")){
               int index = scanner.nextInt();
               Integer value = scanner.nextInt();
               //alist.insert(index,value);
               alist.add(index, value);
             //  alist.re
           } else if(j.equals("Delete")){
               Integer value = scanner.nextInt();
               alist.remove(value);
           }
        }
    }
}
