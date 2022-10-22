package com.TwoDArray;

public class PrintTwoDArray {

	public static void main(String[] args) {
		
		int arr[][] = {
				
					   {1,2,3}, 
					   {6,7,8}, 
					   {4,5,6}  
					   
					   };
		
		
		
		for(int i=0; i <arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
				
				
			}
			
			System.out.println();
		}
		
		
		

	}

}
