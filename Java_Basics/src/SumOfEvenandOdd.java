
public class SumOfEvenandOdd {

	public static void main(String[] args) {
		int esum =0, asum =0; 
		
		for(int i = 1; i <=10 ; i++) {
			
			if( i%2 == 0) {
				
				
				esum = esum+i; 
			}
			else {
				
				asum = asum + i; 
			}
				
			
			
		}
		
		System.out.println("Even Numbers: "+ esum);
		System.out.println("Odd Numbers:  " + asum);

	}

}
