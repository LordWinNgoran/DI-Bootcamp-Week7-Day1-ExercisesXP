//Exercise 4 : Implement Computer Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a new class called Computer.
* Add 3 properties, 2 methods, and a constructor.
* Add two additional sub classes: Laptop and SmartPhone.
* For a child class add at least 1 additional property and 1 additional method.
* date: 06/02/2023
*/
package exercise4;

public class Computer {
	//declaration part all attr
	protected String model;
	private int year;
	private int price;	
	//Constructor with parameters
	public Computer(String model, int year, int price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// All getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//Method Show
	public String Show() {
		return "Computer [model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	
	public boolean isNew() {
		return (this.year>2021)? true: false;
	}
}
