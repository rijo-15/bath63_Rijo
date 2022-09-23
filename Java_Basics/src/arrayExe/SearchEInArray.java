package arrayExe;

public class SearchEInArray {

	public static void main(String[] args) {
		
		int arr[] = {5,6,7,8,9,0,7,8,9};
		
		int x = 5; 
		
		boolean searching = false; 
		
		
		for(int i =0; i < arr.length; i++) {
			
			if(x == arr[i]) {
				
				searching = true; 
				
			}
		}
		
		if(searching == true) {
			System.out.println(x + " is in the array");
		}else {
			System.out.println(x + " is not in the array");
		}

	}

}
