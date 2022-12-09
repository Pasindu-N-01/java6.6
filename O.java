
import java.util.Scanner;

public class O extends O1{


private int age;


public void setO(int age,int mark){
	
	this.age=age;
	
	this.mark=mark;
	
}

public int getO(){
	
	return this.age;
}
public int getO1(){
	
	return this.mark;
}

public void dis(){
	
	System.out.println(this.age+"\n"+this.mark);
}



}