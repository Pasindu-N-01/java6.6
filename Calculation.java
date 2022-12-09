public class Calculation{


public int SumOfSeries(int start, int end, int incr){
	
	int sum = 0;
	for(int x=start; x<=end; x=x+incr){
		
		sum = sum+x;
		
	}
	return sum;
	
}
public int SumOfArray(int data[], int size){
	
	int arraySum = 0;
	for(int x=0; x<size; x++){
		
		arraySum = arraySum+data[x];
	}
	return arraySum;
	
} 
public int ProductOfSeries(int start, int end, int incr){
	
	int poc = 0;
	for(int x=start; x<=end; x=x+incr){
		poc = poc+(poc*x);
		
	}
	return poc;
	
	
} 
public int ProductOfArray(int data[], int size){
	
	int pArray = 0;
	for(int x=0; x<size; x++){
		
		pArray = pArray+(pArray*data[x]);
	}
	return pArray;
	
}


}