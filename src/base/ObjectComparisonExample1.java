package base;

import java.util.Objects;

public class ObjectComparisonExample1 {

	public static void main(String[] args) {
		// Create two Person objects
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        
        // Compare the objects using the hashCode() method
        boolean areEqual = person1.hashCode() == person2.hashCode();
        
        // Print the result
        if (areEqual) {
            System.out.println("The two objects are equal");
        } else {
            System.out.println("The two objects are not equal");
        }
    }
}

class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int hashCode() {
        return Objects.hash(name, age);

	}

}
