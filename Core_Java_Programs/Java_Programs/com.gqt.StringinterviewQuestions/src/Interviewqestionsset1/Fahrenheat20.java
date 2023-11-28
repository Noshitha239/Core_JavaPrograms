//20) You are working as a software developer at a weather forecasting company. The 
//company is developing a new feature for their app that allows users to convert 
//temperatures from Fahrenheit to Celsius. Your task is to create a method that takes a 
//temperature in Fahrenheit and converts it to Celsius.
//Hint: The formula to convert temperature from Fahrenheit to Celsius is 
//C = (F - 32) * 5/9
package Interviewqestionsset1;
import java.util.*;
public class Fahrenheat20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
	    { float Fahrenheit, Celsius;  
	    System.out.println("enter the fahrenheit:");
	        float  Fahrenheit1 =sc.nextFloat();  
	          Celsius  = ((Fahrenheit1-32)*5)/9;  
	          System.out.println("Temperature in celsius is: "+Celsius);  
	    }
	}

}
