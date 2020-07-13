package Shopper.ShopperProject.models;

import java.util.Scanner;

public class Banana {
	double weightPrice = 0;
	double weight = 2.3;
public void weigh(){ 
	
	System.out.println("       ");
	System.out.println("       ");
	System.out.println("The item you have selected weighs 2.3lb");
	System.out.println("*************************");
	System.out.println("Enter Item price per pound :");
	Scanner pricepound = new Scanner(System.in);
	double itemP = pricepound.nextDouble();
	weightPrice = weight * itemP;
	System.out.println("The cost for this item is: $"+weightPrice);
}
}
