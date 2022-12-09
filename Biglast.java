import java.util.*;

public class Biglast{
	
	private int id;
	private String name;
	
	public Biglast(){
		
		this.id=0;
		this.name = "";
		
	}
	
	public Biglast(int id,String name){
		
		this.id=id;
		this.name=name;
		
	}
	
	public void Display(){
		
		System.out.println("name is "+this.name);
		System.out.println("Id is "+this.id);
		
	}

}


