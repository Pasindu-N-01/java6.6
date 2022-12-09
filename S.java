import java.util.*;

public class S{
	
	private static int age;
	private  double sal;
	
	static public int getSal(){
		
		return age;
	}
	
	static public void setsal(int age1){
		
		age=age1;
		
	}
	
	
	public static void main(String args[]){
		
		S.setsal(10);
		System.out.println(S.getSal());
		
	}
	
}