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

// The class Vehicle
package exercise3;

public class Vehicle {
	 private String model;
	    private int speed;

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }
	    
}
