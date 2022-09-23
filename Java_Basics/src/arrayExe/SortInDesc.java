package arrayExe;

public class SortInDesc {

	public static void main(String[] args) {
		
		int temp; 
		
		int arr[] = {15,23,56,7,845,654,12};
		
		System.out.print("Original Array: ");
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp; 
					
				}
			}
		}
		
		
		System.out.println();
		
		System.out.print("Arrays in Desc order: ");
		
		for(int j : arr) {
			System.out.print(j+ " ");
		}
		

	}

}
