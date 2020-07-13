package Shopper.ShopperProject;

import java.util.Scanner;

import Shopper.ShopperProject.models.Banana;
import Shopper.ShopperProject.models.Grocery;
import Shopper.ShopperProject.services.Purchase;

public class MainProgram {
	public static void main(String[] args) {
		System.out.println("***************Welcome to Wazobia Market****************");
		// Entering the total number of items
		System.out.println("Kindly enter the number of items you are purchasing today :");

		listGroceries();

	}

	public static void listGroceries() {
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		Purchase p = new Purchase();
        Banana b = new Banana();
		for (int i = 0; n > i; i++) {
			System.out.println("Dear customer, please enter your items details");
			System.out.println("Item name " + (i+1 ) + ":");
			Scanner name = new Scanner(System.in);
			String itemName = name.nextLine();
			if (itemName.equalsIgnoreCase("banana")) {System.out.println("Please place the item on the scale");
			b.weigh();
			}else {
			
			System.out.println("*************************");
			System.out.println("Enter Item price per unit :");
			Scanner price = new Scanner(System.in);
			double itemPrice = price.nextDouble();
			System.out.println("*************************");
			System.out.println("Enter Item quantity :");
			Scanner quantity1 = new Scanner(System.in);
			int quantity = quantity1.nextInt();

			Grocery g = new Grocery();
			g.setItemName(itemName);
			g.setPrice(itemPrice);
			g.setQuantity(quantity);
			g.setPricePerItem();

			p.listItems(g);}

		}
		//p.DisplayPurchase();
        p.MakePayment();
        
	}
}
// Code limitations
//Code cannot process other cards asides the preset one