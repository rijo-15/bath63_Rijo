package com.Encap;

public class Customer {

		private int custID; 
		private String custName;
		private String custLoc; 
		private int custPhno; 
		
		
		public Customer(int custID, String custName, String custLoc, int custPhno) {
			super();
			this.custID = custID;
			this.custName = custName;
			this.custLoc = custLoc;
			this.custPhno = custPhno;
		}


		public String display() {
			return "Customer [custID=" + custID + ", custName=" + custName + ", custLoc=" + custLoc + ", custPhno="
					+ custPhno + "]";
		}
		
		

}


