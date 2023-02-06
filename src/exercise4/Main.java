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

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop("HP 1504", 2022,1500,"8 GB");
        laptop.getLaptopDetails();
        laptop.info();
        
        SmartPhone smartphone = new SmartPhone("Iphone", 2019, 750, true);
        smartphone.info();
        smartphone.getPhoneDetails();
        System.out.println(smartphone.isNew());

	}

}
