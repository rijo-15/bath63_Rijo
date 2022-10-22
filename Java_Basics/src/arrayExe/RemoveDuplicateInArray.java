package arrayExe;

public class RemoveDuplicateInArray {
	

	public static void main(String[] args) {
		
		int arr[] = {12,13,13,15,15,16}; 
		
		int len = arr.length; 
		
		int temp =0; 
		
		
		
		
//		for(int i =0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] >= arr[j]) {
//					temp = arr[i]; 
//					arr[i] = arr[j]; 
//					arr[j]= arr[i]; 
//				}
//			}
//			
//		}
		
		
		removeDuplicate(arr, len); 
		
	}
	
	
	public static void removeDuplicate(int arr[], int n) {
		
		int temp[] = new int[n]; 
		
		int j = 0;
		
		for(int i = 0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i]; 
			}
		}
		
		
		temp[j++] = arr[n-1]; 
		
		for(int k = 0; k <j;k++) {
			
			System.out.print(temp[k]+ " ");
		}
	}
	
	
	
	}
	
	


