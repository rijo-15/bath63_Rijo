
public class CheckPrimeNUmber {

	public static void main(String[] args) {
		
	int num = 9; 
	
	boolean prime = false; 
	 
	
	for(int i = 2; i < num; i++) {

		if(num % i ==0) {
		prime = true; 
			
			break; 
		}
		
	}
	if(!prime) {
		System.out.println("It is a prime number");
	}else {
		System.out.println("It is not a prime number");
	}
	
	
	}
	
}

