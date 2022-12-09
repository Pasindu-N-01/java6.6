public class Conversation{

public double KMToMiles(double distance){
	
	double ans = distance/0.6214;
	return ans;
	
}
public double MilesToKM(double distance){
	
	double ans = distance*0.6214;
	return ans;
	
} 
public double FeetToMetres(double distance){
	
	double ans = distance/3.281;
	return ans;
	
} 
public double MetresToFeet(double distance){
	
	double ans = distance*3.281;
	return ans;
	
} 
public double KgToPounds(double weight){
	
	double ans = weight*2.2045;
	return ans;
	
} 
public double PoundsToKg(double weight){
	
	double ans = weight/2.2045;
	return ans;
	
} 
public double CelciusToFahrenheit(double temperature){
	
	double ans = (temperature*1.8)+32;
	return ans;
	
} 
public double FahrenheightToCelcius(double temperature){
	
	double ans = (temperature - 32)*(5.0/9);
	return ans;
	
}

}