package assignment5JavaMethods; // Step 1: Package Name

/*
Assignment_5_Java_Methods:
Step 1: Create a package name "assignment5JavaMethods" in your Assignment project.

Step 2: Inside the package, Create a class "MyFamily" and initialize some int type variables -- 
		child1Age, child2Age, child3Age, child4Age which can be public or protected or default in nature.

Step 3: Implement a return type method which is int type which name could be same as class name. 
		Please follow naming convention for methods. The outcome should be: "The sum of my children age is: " + <sum>

Step 4: Create a main method after the method, Instantiate the class and call the method by the object.
*/

public class MyFamily { // Step 2: Class Name

	// Step 2: Initializing Variables
	public int child1Age = 20;
	protected int child2Age = 17;
	int child3Age = 14;
	int child4Age = 12;


	// Step 3: Return type method
	public int myChildsTotalAge() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my children age is: " + sum); // Step 3: Method Outcome
		return sum;
	}

	// Step 4: main method
	public static void main(String[] args) {
		
		MyFamily myFamily = new MyFamily(); //Step 4: Instantiating class object
		myFamily.myChildsTotalAge(); // Step 4: Calling method by the object
	}

}
