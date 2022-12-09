
import java.util.*;

public class Menu{

public static void main(String args[]){

Scanner ob = new Scanner(System.in);
Menu m1 = new Menu();
m1.displayMainMenu();
	
}

	
void displayMainMenu(){
	
	Scanner ob = new Scanner(System.in);
	
	System.out.println("********************************");
    System.out.println("_____Main_Menu_____");
    System.out.println("1 - Conversion Menu");
    System.out.println("2 -  Calculation Menu");
    System.out.println("0 -  Exit");
	
	
    System.out.print("Enter the number :");
	int no=ob.nextInt();
	
	if(no==0){
		System.exit(0);
		}
	else if(no==1){
		displayConversionSubMenu();
		}
	else if(no==2){
		displayCalculationSubMenu();
		}
	else{
		System.out.println("*****Invalid Number Please Enter again!!!");
        displayMainMenu();
	}
} 



void displayConversionSubMenu(){
	
	Scanner ob1 = new Scanner(System.in);
	
	System.out.println("***********************************");
    System.out.println("_____Conversion_Sub_Menu_____");
    System.out.println("1 - Conversion Length");
    System.out.println("2 - Conversion Weight");
    System.out.println("3 - Conversion Temperature");
    System.out.println("0 -  Exit");
	
	
	
    System.out.print("Enter the number :");
	int no = ob1.nextInt();
	
	if(no==0){
		displayMainMenu();
		}
	else if(no==1){
		displayConversionLengthSubmenu();
		}
	else if(no==2){
		displayConversionWeightSubmenu();
		}
	else if(no==3){
        displayConversionTemperatureSubmenu();
	}
	else{
		System.out.println("*****Invalid Number Please Enter again!!!");
        displayConversionSubMenu();
	}
} 



void displayCalculationSubMenu(){
		Scanner ob2 = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("_____Calculation_Sub_Menu____");
        System.out.println("1 - Sum of Series");
        System.out.println("2 - Sum of Array");
        System.out.println("3 - Product of Series");
        System.out.println("4 - Product of Array"); 
        System.out.println("0 - Exit");
		
        System.out.print("Enter the number : ");
        int no = ob2.nextInt();

        Calculation c = new Calculation();

        int start,end,incr,answer,size;
        int[] ar;
		
		if(no==0){
			
			displayMainMenu();
			
		}
         else if(no==1){
                System.out.print("Start value : ");
                start = ob2.nextInt();
                System.out.print("End value: ");
                end = ob2.nextInt();
                System.out.print("Increment value : ");
                incr = ob2.nextInt();
                answer = c.SumOfSeries(start,end,incr);
                System.out.println("Answer is : " + answer);
                displayCalculationSubMenu();
		 }
                
          else if(no==2){
			  
                System.out.print("array size : ");
                size = ob2.nextInt();

                ar = new int[size];

                for(int x=0; x<size;x++){
                    System.out.print("Enter value " + x + " : ");
                    ar[x] = ob2.nextInt();
                }
                answer = c.SumOfArray(ar,size);
                System.out.println("answer is : " +answer);
                displayCalculationSubMenu();
		  }
		  
         else if(no==3){
                System.out.print("Start value : ");
                start = ob2.nextInt();
                System.out.print("End value : ");
                end = ob2.nextInt();
                System.out.print("Increment value : ");
                incr = ob2.nextInt();
                answer = c.ProductOfSeries(start,end,incr);
                System.out.println("answer is : " + answer);
                displayCalculationSubMenu();
		 }
                
          else if(no==4){
                System.out.print("array size : ");
                size = ob2.nextInt();

                ar = new int[size];

                for(int x=0; x<size;x++){
                    System.out.print("Enter index value " + x + " : ");
                    ar[x] = ob2.nextInt();
                }
                answer = c.SumOfArray(ar,size);
                System.out.println("answer is : " + answer);
                displayCalculationSubMenu();
		  }
            else{
                System.out.println("Invalid number !!! please enter again ");
                displayCalculationSubMenu();
			}
} 




void displayConversionLengthSubmenu(){
		Scanner ob3 = new Scanner(System.in);
		
        System.out.println("******************************************");
        System.out.println("_____Conversion_Length_Menu_____");
        System.out.println("1 - KM to Miles");
        System.out.println("2 - Miles to KM");
        System.out.println("3 - Feet to Metres");
        System.out.println("4 - Metres to Feet");
        System.out.println("0 - Exit");
		
		double dis,answer;
		
		
        System.out.print("Enter the number :");
        int no = ob3.nextInt();

        Conversation conver = new Conversation();
		
		if(no==0){
			
			displayConversionSubMenu();
			
		}
		
        else if(no==1){
                System.out.print("Enter value in km : ");
                dis = ob3.nextDouble();
                answer = conver.KMToMiles(dis);
                System.out.println("answer is : " +answer+" Miles");
                displayConversionLengthSubmenu();
				
		}
		
        else if(no==2){
                System.out.print("Enter value in Miles : ");
                dis = ob3.nextDouble();
                answer = conver.MilesToKM(dis);
                System.out.println("answer : "+answer+" km");
                displayConversionLengthSubmenu();
		}
		
        else if(no==3){
                System.out.print("Enter value in Feet : ");
                dis = ob3.nextDouble();
                answer = conver.FeetToMetres(dis);
                System.out.println("answer : " +answer+ " m ");
                displayConversionLengthSubmenu();
		}
		
        else if(no==4){
                System.out.print("Enter value in m : ");
                dis = ob3.nextDouble();
                answer = conver.MetresToFeet(dis);
                System.out.println("answer is : " +answer+ " feet");
                displayConversionLengthSubmenu();
		}
            
        else{
                System.out.println("Invalid number !!! please enter again ");
                displayConversionLengthSubmenu();
		}
}


 
void displayConversionWeightSubmenu(){
		Scanner ob5 = new Scanner(System.in);
		
        System.out.println("***********************************************");
        System.out.println("_____Conversion_Weight_Menu_____");
        System.out.println("1 - KG to Pounds");
        System.out.println("2 - Pounds to KG");
        System.out.println("0 - Exit");
		
		double w,answer;
	
	
        System.out.print("Enter the number : ");
        int no = ob5.nextInt();

        Conversation conver5 = new Conversation();
		
		if(no==0){
			
			displayConversionSubMenu();
			
		}
        else if(no==1){
                System.out.print("Enter weight in Kg : ");
                w = ob5.nextDouble();
                answer = conver5.KgToPounds(w);
                System.out.println("answer is  : " +answer+ " pounds");
                displayConversionWeightSubmenu();
		}
        else if(no==2){
                System.out.print("Enter weight in Pounds : ");
                w = ob5.nextDouble();
                answer = conver5.PoundsToKg(w);
                System.out.println("answer : "+answer+" km");
                displayConversionWeightSubmenu();
                
		}
		else{
                System.out.println("Invalid number !!! please enter again ");
                displayConversionWeightSubmenu();
        }

	
}

 
void displayConversionTemperatureSubmenu(){
		
		Scanner ob6 = new Scanner(System.in);
		
        System.out.println("*************************************************");
        System.out.println("_____Conversion_Temperature_Menu_____");
        System.out.println("1 - Celcius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celcius");
        System.out.println("0 - Exit");
		
		double tmp,answer;
		
		
        System.out.print("Enter the number : ");
        int no = ob6.nextInt();

        Conversation conver6 = new Conversation();
		
		if(no==0){
			
			displayConversionSubMenu();
			
		}
        else if(no==1){
                System.out.print("Enter tempreture in C : ");
                tmp = ob6.nextDouble();
                answer = conver6.CelciusToFahrenheit(tmp);
                System.out.println("answer is : " +answer+ " F");
                displayConversionTemperatureSubmenu();
		}
		
         else if(no==2){
                System.out.print("Enter tempreture in F : ");
                tmp = ob6.nextDouble();
                answer = conver6.FahrenheightToCelcius(tmp);
                System.out.println("answer is : " +answer+ " C");
                displayConversionTemperatureSubmenu();
		 }
           
         else{
                System.out.println("Invalid number !!! please enter again ");
                displayConversionTemperatureSubmenu();
        }

	
}



}