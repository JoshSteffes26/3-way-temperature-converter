import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scaleFromInput=new Scanner(System.in);
		Scanner scaleToInput=new Scanner(System.in);
		Scanner tempValueInput=new Scanner(System.in);
		String userScaleFrom;
		String userTemp;
		double userTempValue;
		String userScaleTo;
		
		
		System.out.println("Welcome to the Temp Converter! Please enter a temperture scale to convert from (F, C, or K): ");
		userScaleFrom=scaleFromInput.nextLine().toUpperCase();
		switch(userScaleFrom) {
		case "F":
			System.out.println("Please enter a temperature");
			userTemp=tempValueInput.nextLine();
			try {
			userTempValue=Double.parseDouble(userTemp);
			System.out.println("Please enter a temperature scale to convert to (F, C, or K): ");
			userScaleTo=scaleToInput.nextLine().toUpperCase();
			switch(userScaleTo) {
			    case "F":
			    	System.out.println(userTempValue);
			    	break;
				case "C":
					double result=userTempValue*(5/9)-32;
					System.out.println(result);
					break;
				case "K":
					double result2=userTempValue*(5/9)+459.67;
					System.out.println(result2);
					break;
			    default:
			    	System.out.println("Please try again");
			    	break;
			}
			break;
			} catch(Exception e) {
				System.out.println("Please try again");
			}
			
		case "C":
			System.out.println("Please enter a temperature");
			userTemp=tempValueInput.nextLine();
			try {
			userTempValue=Double.parseDouble(userTemp);
			System.out.println("Please enter a temperature scale to convert to: ");
			userScaleTo=scaleToInput.nextLine().toUpperCase();
			switch(userScaleTo) {
			    case "F":
			    	double result=userTempValue*(9/5)+32;
			    	System.out.println(result);
			    	break;
				case "C":
					System.out.println(userTempValue);
			    	break;
				case "K":
					double result2=userTempValue+273.15;
					System.out.println(result2);
			    	break;
			    default:
			    	System.out.println("Please try again");
			    	break;
			}
			break;
			} catch (Exception e) {
				System.out.println("Please try again");
			}
		
		case "K":
			System.out.println("Please enter a temperature");
			userTemp=tempValueInput.nextLine();
			try {
			userTempValue=Double.parseDouble(userTemp);
			System.out.println("Please enter a temperature scale to convert to: ");
			userScaleTo=scaleToInput.nextLine().toUpperCase();
			switch(userScaleTo) {
			    case "F":
			    	double result=userTempValue*(9/5)-459.67;
			    	System.out.println(result);
			    	break;
				case "C":
					double result2=userTempValue-273.15;
					System.out.println(result2);
			    	break;
				case "K":
					System.out.println(userTempValue);
			    	break;
			    default:
			    	System.out.println("Please try again");
			    	break;
			  
			}
			break;
			} catch (Exception e) {
				System.out.println("Please try again");
			}
		 default:
		    	System.out.println("Please try again");
		    	break;
			
		}
	
		

	}

}
