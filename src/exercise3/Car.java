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

// The Car class extends Vehicle
package exercise3;

public class Car extends Vehicle {
    
    private String name;

    public Car() {
        super();
    }

    public void setDetails(String name, String model, int speed) {
        this.name = name;
        setModel(model);
        setSpeed(speed);
    }

    public String getDetails(String carName) {
        return carName + ", " + getModel() + ", " + getSpeed();
    }
    
}