
public class ReverseNO {

	public static void main(String[] args) {
		
		int a =123;
		int sum =0; 
		int res =0; 
		
		while(a != 0) {
			res = a % 10; // 3, 2, 1 
			sum = sum * 10 + res; //3,32, 321 
			a = a/10; //12, 1, 0 
			
		}
		
		System.out.println(sum);
		
	}

}
