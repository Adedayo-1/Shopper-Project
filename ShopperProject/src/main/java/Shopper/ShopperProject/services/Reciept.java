package Shopper.ShopperProject.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Shopper.ShopperProject.models.Card; 
public class Reciept {
	
	public static void printreciept(){
	System.out.println("Item name" + "  " + "Quantity" + "  " + "Unit price"+ "    "+ "Item price");
	
	Purchase p = new Purchase();
	p.DisplayPurchase();
	Card c = new Card();
	System.out.println("Paid for by: "+ c.getCardName());
	}


 
  
  public static void timeStamp() {  
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
  }  
}  

 