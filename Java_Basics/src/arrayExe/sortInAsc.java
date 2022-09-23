package arrayExe;

public class sortInAsc {

	public static void main(String[] args) {
		
		int arr[] = {34,5,64,56,6,5,34,89}; 
		
		int temp =0;
		
		System.out.print("Array before sorting: ");
		
		for(int a : arr) {
			System.out.print(" " + a);
			
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp  = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp; 
					
					
					
				}
			}
		}
		
		System.out.print("Array in Asc Order: ");
		
		
		for(int b : arr) {
			System.out.print(b + " ");
		}

	}

}
