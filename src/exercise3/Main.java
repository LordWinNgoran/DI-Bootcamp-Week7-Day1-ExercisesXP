//Exercise 3 : Implement The Derived Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Implement the Base Class Vehicle with the member functions:
* getModel()
* and getSpeed()
* which return the model and speed of the car respectively.
* Implement a function getDetails(String carName) of the Class Car which takes a string 
* carName and appends it with model, name, and speed.
* date: 06/02/2023
*/

// The Main class
package exercise3;

public class Main {
	public static void main(String[] args) {

		Car car = new Car();
		car.setDetails("Roadster", "Tesla", 100);
		System.out.println(car.getDetails("Roadster"));
	}
}
