package Shopper.ShopperProject.models;

public class Grocery {
String itemName;
String itemCategory;
int dimensions;
double price;
int itemId;
int quantity;
double pricePerItem;


public double getPricePerItem() {
	return pricePerItem;
}
public void setPricePerItem() {
	this.pricePerItem = price*quantity;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getItemCategory() {
	return itemCategory;
}
public void setItemCategory(String itemCategory) {
	this.itemCategory = itemCategory;
}
public int getDimensions() {
	return dimensions;
}
public void setDimensions(int dimensions) {
	this.dimensions = dimensions;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}

public String to() { 
	return "|" +this.itemName +"             "+ this.quantity + "          "+"$"+this.price +"           "+"$"+this.pricePerItem+"|";

}
}
