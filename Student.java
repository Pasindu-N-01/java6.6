import java.util.*;

public class Student extends Person{
	
	private int id;
	
	public void setdetails(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter name ");
		name=sc.nextLine();
		
		System.out.print("enter age ");
		age = sc.nextInt();
		
		System.out.print("enter id ");
		id = sc.nextInt();
		
	}
	
	public void Dis(){
		
		System.out.println("name - "+name);
		System.out.println("age - "+age);
		System.out.println("id - "+id);
	}
	
	
	
}