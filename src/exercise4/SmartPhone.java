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

public class SmartPhone extends Computer {

	private boolean isIphone;
	public SmartPhone(String model, int year, int price,boolean isIphone) {
		super(model, year, price);
		this.isIphone = isIphone;
	}
	

	public void info() {
       System.out.println("THis section is for Phone");
    }

	public void getPhoneDetails() {
		System.out.println(model + ", " + getYear() + ", " + getPrice());
		
	}
	
	public boolean isNew() {
		int year = this.getYear();
		return (year>2021)? true: false;
	}

}
