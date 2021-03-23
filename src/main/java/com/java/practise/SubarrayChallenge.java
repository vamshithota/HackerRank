package com.java.practise;

public class SubarrayChallenge {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    int n=5;
    int[] array1= {1,-2,4,-5,1};
    int count =0;
    for(int j=0;j<n;j++){
        int sum=0;
        for(int k=j;k<n;k++){
            sum += array1[k];
            if(sum <0){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
