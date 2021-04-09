package sample1;

import java.util.Scanner;

public class ElectricityBillCalculator {
	
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Electricicty Bill Calculator");
    	System.out.println("Domestic -1    Commercial -2");
    	System.out.print("Enter connection type(1 or 2) : ");
    	int type = s.nextInt();
    	System.out.print("Enter number of units : ");
    	int units = s.nextInt();
    	if(type ==1) {
    		calculateDomesticBill(units);
    	}
    	else if(type ==2) {
    		calculateCommercialBill(units);
    	}else {
    		System.out.println("wrong input! Input must be either 1 or 2");
    	}
    }
    public static void calculateDomesticBill(int units) {
    	double bill = 250;
    	if(units<0) {System.out.println("Invalid units given!");
		return;
		}
    	if(units<=100) {
    		double amount = units*4;
    		if(amount>bill) {bill = amount;}
    	}
    	else if(units<=300) {
    		bill = units*4.5;
    	}
    	else if(units<=500) {
    		bill = units*4.75;
    	}
    	else if(units>500) {
    		bill = units*5;
    	}
    	
    	System.out.println("your bill is = Rs."+bill);
    }
    
    public static void calculateCommercialBill(int units) {
    	double bill = 350;
    	if(units<0) {System.out.println("Invalid units given!");
		return;
		}
    	if( units<=100) {
    		double amount = units*4.25;
    		if(amount>bill) {bill = amount;}
    	}
    	else if(units<=300) {
    		bill = units*4.75;
    	}
    	else if(units<=500) {
    		bill = units*5;
    	}
    	else if(units>500) {
    		bill = units*5.25;
    	}
    	System.out.println("your bill is = Rs."+bill);
    }
}
