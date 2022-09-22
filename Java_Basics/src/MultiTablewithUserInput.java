import java.util.Scanner;

public class MultiTablewithUserInput {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please Enter a number: ");
		
		int num = input.nextInt(); 
		
		
		for(int i = 1; i <=10; i++) {
			
			
			System.out.println(num + " X " + i + " = " + num * i);
			
		}
		

	}

}
