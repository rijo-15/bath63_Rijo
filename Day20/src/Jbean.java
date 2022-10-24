
public class Jbean {

	private int stno; 
	private String stname; 
	private String email;
	
	
	
	
	public Jbean() {
		super();
	}




	public Jbean(int stno, String stname, String email) {
		super();
		this.stno = stno;
		this.stname = stname;
		this.email = email;
	}




	public int getStno() {
		return stno;
	}




	public void setStno(int stno) {
		this.stno = stno;
	}




	public String getStname() {
		return stname;
	}




	public void setStname(String stname) {
		this.stname = stname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
