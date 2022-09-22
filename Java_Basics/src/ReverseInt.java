import java.util.Scanner;

//2.7
public class ReverseInt {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		
		System.out.print ("Enter the Integer: ");
		
		int num = input.nextInt(); 
		
		int res = 0; 
		int sum = 0; 
		
		
		while( num !=0 ) {
			
			res = num % 10; //3
			
			sum = sum * 10 + res; //3
			
			num = num /10;
			
		}
		
		System.out.println(sum);

		
		
	}

}
