//Exercise 2 : Implement The Person Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:See instruction
* date: 06/02/2023
*/
package exercise2;

public class Person {
	//declaration part all attributes
    private String name;
    private String lastName;
    private String email;
    private int age;

    // Constructor by default
    public Person() {
    	
    }
 // Constructor with parameters

    public Person(String name, String lastName, String email, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    //All getters and setters for attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method to output the result it reurn a string
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + '}';
    }


	public static void main(String[] args) {
		Person person = new Person("Lordwin", "Ngoran", "ngoranmail@gmail.com", 55);
        
        System.out.println("Name: " + person.toString());

	}

}
