//Exercise 1 : Implement MyPoint Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:A class called MyPoint, which models a 2D point with x and y coordinates, 
* is designed as shown in the class diagram
* date: 06/02/2023
*/
package exercise1;

public class MyPoint {
	//declaration part
	private int x;
	private int y;

	// default constructor
	public MyPoint() {
		super();
	}

	// Constructor with two parameters
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Generate Getter and setter for x
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// Generate Getter and setter for y
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Method setXY
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Method getXY
	public int[] getXY() {
		int[] coordinates = { x, y };
		return coordinates;
	}

	// method toString

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	// Method distance return a double 
	//We provide the formula to calculate the distance between two points
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1.distance(5, 6));

	}

}
