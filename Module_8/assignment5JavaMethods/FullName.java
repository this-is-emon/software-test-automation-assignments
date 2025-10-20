package assignment5JavaMethods; // Step 1: Package Name
/*
Assignment_5_Java_Methods:

Step 5: Inside the same package, Create another class "FullName".

Step 6: Implement a return type parameterized method which is String type, 
		which name could be same as class name. Please follow naming convention for methods. 
		Use fName and lName as a parameter which are String in nature. 
		In the method body create a syso to print: "Family Member: " + <fName> + " "+ <lName>

Step 7: Create a main method after the method, 
		Instantiate the class and call the method by the object. 
		Can you call a parameterized method more than one with different arguments? 
		If yes, then print all Family members name.

Step 8: Organize your code. Push in the GitHub. Paste the link of package 'assignment5JavaMethods' below.
*/

public class FullName { // Step 5:Another class "FullName".


	// Step 6: String return type parameterized method
	public String fullName(String fName, String lName) { // Step 6: String type parameter
		System.out.println("Family Member: " + fName + " " + lName); // Step 6: SYSO outcome
		return null;
	}

	// Step 7: Main method
	public static void main(String[] args) {
		
		FullName familyMemberName = new FullName(); // Step 7: Instantiating class object
		// Step 7: Calling parameterized method & printing names
		familyMemberName.fullName("John", "Doe");
		familyMemberName.fullName("Chris", "Martin");
		familyMemberName.fullName("Nancy", "Polecy");
		familyMemberName.fullName("Mickel", "Jackson");
	}

}
