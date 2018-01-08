package emailApp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String altEmail;
	
	private int mailboxCap;
	private int defaultPasswordLength = 10;
	
	//Constructor to get the first and last name
	
	public email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call method asking for department and return department
		this.department = setDepartment();
		System.out.println("Department " + department);
	
		// Call method that returns random password
		
		this.password = createPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
			
	
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none ");
		Scanner scan = new Scanner(System.in);
		int departNum = scan.nextInt();
		if (departNum == 1 ) {
			return "Sales";
		}
		else if (departNum == 2) {
			return "Development";
		}
		else if (departNum == 3) {
			return "Accounting";
		}
		else  {
			return " ";
		}
	}
	
	//Generate a random password
	private String createPassword(int length) {
		 String passwordSet = "ABCDEFGHIJKLOMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		 char[] password = new char[length];
		 for (int i=0; i<length; i++) {
			 int random = (int) (Math.random() * passwordSet.length());
			 password[i] = passwordSet.charAt(random);
		 }
		 return new String(password);
	}
	
	//Set mailbox cap
	
	//Set alt email
	
	//Change email
	
	
}
