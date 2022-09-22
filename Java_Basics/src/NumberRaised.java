import java.util.Scanner;

public class NumberRaised {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		int sum = 0; 
		
		System.out.print("Enter the first Number: ");
		
		int firstnum = input.nextInt(); 
		
		
		System.out.println("Enter the Second num: ");
		
		int secondnum = input.nextInt(); 
		
		
		for(int i =0; i <= secondnum; i++) {
			
			sum = firstnum * i; 
		}
		
		
		System.out.println(firstnum + " to the power of "+ secondnum + " =  " + sum);
		

	}

}
