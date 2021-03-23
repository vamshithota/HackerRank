package com.java.practise;

public class Currencyformater {
public static void main(String[] args) {
	 double payment = 12345.12;
     
     // Write your code here.
     String stringP = String.valueOf(payment);
     System.out.println(stringP);
     String ar[] = stringP.split(".");
     String init = ar[0];
     System.out.println(init);
     if(init.length()==5){
         init = init.substring(0,2)+"," + init.substring(2, init.length()-1);
     }
     init = init+ar[1];
     System.out.println(init);
     /*System.out.println("US: " + us);
     System.out.println("India: " + india);
     System.out.println("China: " + china);
     System.out.println("France: " + france);*/
}
}
