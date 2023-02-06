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

public class Laptop extends Computer {

	private String ram;
	public Laptop(String model, int year, int price,String ram) {
		super(model, year, price);
		this.ram = ram;
	}
	

	public void info() {
       System.out.println("THis section is for computer");
    }

	public void getLaptopDetails() {
		System.out.println(model + ", " + getYear() + ", " + getPrice());
		
	}

}
