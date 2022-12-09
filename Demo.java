//import java.util.Scanner;

import java.io.*;

public class Demo{
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		OddEven od = new OddEven();
		
		System.out.println("enter number : ");
		//int num = sc.nextInt();
		int num = Integer.parseInt(br.readLine());
		
		boolean x = od.Find(num);
		
		if(x==true)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}
}