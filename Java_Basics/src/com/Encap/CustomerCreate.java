package com.Encap;

import java.util.Iterator;

public class CustomerCreate {

	public static void main(String[] args) {
		
		Customer cust[] = new Customer[3];
		
		
		Customer c1 = new Customer(1, "Mike", "US", 123456789); 
		Customer c2 = new Customer(1, "Mike", "US", 123456789); 
		Customer c3 = new Customer(1, "Mike", "US", 123456789); 
		
		cust[0] = c1;
		cust[1] = c2;
		cust[2] = c3;
		
		
//		for(Customer cus : cust ) {
//			System.out.println(cus.display());
//		}
		
		for(int i =0; i <cust.length; i++) {
			System.out.println(cust[i].display());
		}
		

	}

}
