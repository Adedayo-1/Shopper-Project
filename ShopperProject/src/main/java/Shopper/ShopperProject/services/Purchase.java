package Shopper.ShopperProject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Shopper.ShopperProject.models.Card;
import Shopper.ShopperProject.models.Grocery;

public class Purchase {
	public List<Grocery> groceries;
	double totalSum = 0;
	Reciept t = new Reciept();

//Create List
	public Purchase() {
		groceries = new ArrayList<>();

	}

//Populate list
	public void listItems(Grocery groceries) {
		if (groceries != null) {
			this.groceries.add(groceries);
		} else {
			this.groceries = new ArrayList<>();
			this.groceries.add(groceries);
		}
		totalSum += groceries.getPricePerItem();
	}

//Calculation of PPU
	public void DisplayPurchase()

	{
		System.out.println("       ");
		System.out.println("       ");
		System.out.println("Item name" + "        " + "Quantity" + "      " + "Price" + "    " + "Total price");
		for (int i = 0; groceries.size() > i; i++) {
			System.out.println(groceries.get(i).to());
			//totalSum += groceries.get(i).getPricePerItem();

		} // Initial display of total cost
		System.out.println("Your total shopping cost today is  $" + totalSum);
		System.out.println("       ");
		System.out.println("       ");
	}

//Making payment

	public void MakePayment() {
		System.out.println("Your total shopping cost today is  $" + totalSum);
				System.out.println("       ");
		Card card = new Card();
		System.out.println("Do you want to pay with a card ?");
		Scanner scanner = new Scanner(System.in);
		String response = scanner.next();
		if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
			System.out.println("Enter card number: "); // Card details
			String details = scanner.next();
			System.out.println("Enter card holder name: "); // Card details
			String cardnames = scanner.next();
			if (card.getCardNo().equals(details)  && card.getCardName().equalsIgnoreCase(cardnames)) {
				System.out.println("Your previous balance was :$" + card.getBalance());
				if (card.getBalance() >= totalSum) {
					double x = card.getBalance() - totalSum;
					System.out.println("Your payment is successful and your new balance is :$" + x);
					System.out.println("Do you want to print your reciept ?");
					Scanner print = new Scanner(System.in);
					String printresponse = print.next();
					if (printresponse.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {

						DisplayPurchase();
						t.timeStamp();
						System.out.println("Thank you for shopping with us and have a nice day");
					} else
						System.out.println("Thank you for shopping with us and have a nice day"); // Scenario 1 :
																									// successful
																									// payment
				} else {
					System.out.println(" Your balance is insufficient for this transaction please return our items"); // Scenario
																														// 2
																														// unsuccessful
																														// payment
				}
			} else {
				System.out.println("The card details you entered are wrong. Would you like to re-enter the details?"); // Unsuccessful
																														// payment
																														// due
																														// to
																														// wrong
																														// card details
				String response2 = scanner.next();
				if (response2.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
					System.out.println("Please re-enter card number: ");
					String details1 = scanner.next();
					System.out.println("Enter card holder name: "); // Card details
					String cardnames1 = scanner.next();
					if (card.getCardNo().equals(details1)&& card.getCardName().equalsIgnoreCase(cardnames1)) {
						System.out.println("Your previous balance was :$" + card.getBalance());
						double x = card.getBalance() - totalSum;
						System.out.println("       ");
						System.out.println("       ");
						System.out.println("Your payment is successful and your new balance is :$" + x);
						System.out.println("Do you want to print your reciept ?");
						Scanner printr = new Scanner(System.in);
						String printresponse = printr.next();
						if (printresponse.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {

							DisplayPurchase();
							t.timeStamp();
							System.out.println("Thank you for shopping with us and have a nice day");
						} else {
							System.out.println("Thank you for shopping with us and have a nice day");
						}
					} else

					{
						System.out.println(
								" You have entered the wrong card details again.Please press the RESET button to start over");// Scenario
																																// 4
																																// wrong
																																// card
																																// details
																																// twice

					}
				}

			}
		} else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
			System.out.println("Please enter insert cash in the opening below"); // Scenario 5 paying with cash
		} else {
			System.out.println(" You have entered an invalid command. Please press the RESET button yo start over");
		}
	}
	public void  weightedPayment() {
		
	
	}
}
