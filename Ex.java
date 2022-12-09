import java.util.Scanner;
public class Ex{
	public static void main(String[] args){
		
		Scanner ob=new Scanner(System.in);
		
		/*System.out.println("Hello world");
		
		System.out.print("My name is :");
		String name=ob.next();
		
		System.out.print("My age is :");
		int age=ob.nextInt();
		
		System.out.println("Name is : "+name+ " and Age is : "+age);*/
		
		int x;
		
		System.out.print("enter the number ");
		int number=ob.nextInt();
		
		if(number>10)
		{
			x = number*2;
		}
		else {
			x = number*5;
		}
		System.out.println("answer is "+x);
	}
}