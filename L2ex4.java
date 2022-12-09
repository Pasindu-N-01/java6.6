
import java.io.*;

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;*/

public class L2ex4{
	
	public static void main(String args[]) throws IOException{
		
		//BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.print("enter marks : ");
		double mark = Double.parseDouble(bfr.readLine());      //- buffer class
		//double mark = bfr.nextDouble(); - in scanner class
		
		System.out.print("enter length : ");
		double length = Double.parseDouble(bfr.readLine());
		
		System.out.print("enter width : ");
		double width = Double.parseDouble(bfr.readLine());
		
		System.out.print("enter height : ");
		double height = Double.parseDouble(bfr.readLine());
		
		double volume = height*width*length;
		
		System.out.println("volume : "+volume);
	}
	
	
}