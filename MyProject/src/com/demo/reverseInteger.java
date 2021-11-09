package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseInteger {

	/*
	 * public static int reverse(reverseInteger[] reverse) {
	 * 
	 * for(int i = 0; i <= reverse; i++){
	 * 
	 * System.out.println(i); } return reverse;
	 * 
	 * 
	 * }
	 */	    
	
	//public static void reverseArray(Integer[] arr) {
		
		//Collections.sort(arr);
		//Collections.reverse(Arrays.asList(arr));
		//System.out.println(Arrays.asList(arr));}
		 static void reverse(int[] arr, int n)
		    {
		        int[] b = new int[n];
		        int j = n;
		        for (int i = 0; i < n; i++) {
		            b[j - 1] = arr[i];
		            j = j - 1;
		        }
		        
		        //print the reverse value
		        
		        for(int k = 0; k<n; k++ ) {
		        	System.out.println(b[k]);
		        }
		        
		        
		    }
	
	
	
	
	    public static void main(String[] args) {
	    	//reverseInteger[] reverse = {2,3,48,6};
	    	
	   // 	reverse(reverse);
	    	int[] arr = {11, 99};
	    	//int length = arr-1;
	    	reverse(arr,arr.length);
	    //	reverseArray(arr);
	        //StringBuilder reversed = new StringBuilder();

	        //for (int i = arr.length; i > 0; i--) {
	          //  reversed.append(arr[i - 1]).append(" ");
	        //};
	         
	        //String[] reversedArray = reversed.toString().split(" ");
	    	
	    	
	         
	        //System.out.println(Arrays.toString(reversedArray));
	      }
	   
	    }
	
	

