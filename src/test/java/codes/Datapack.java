package codes;

public class Datapack {
	
	private int a1 ;
	private String s1;
	
	public Datapack(int a1, String s1) {
		this.a1=a1;
		this.s1=s1;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	
	public String toString(){//overriding the toString() method  
		  return a1+" "+s1;  
		 } 

}
