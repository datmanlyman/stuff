package project;

import java.util.*;

public class Student {
	private Hashtable<String, String> studentLogin = new Hashtable<String, String>();
	MainApp main = new MainApp();
	
	public void Student() {
		
	}
	
	public void studentMenu() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		int choice = 0;
		
		do {
			System.out.println("1. Register a course");
			System.out.println("2. Drop course");
			System.out.println("3. Print courses registered");
			System.out.println("4. Check vacancies for an index group number");
			System.out.println("5. Change index group number of course");
			System.out.println("6. Swap index group number with another student");
			System.out.println("7. Select Notification Mode");
			System.out.println("8. Logout");
			System.out.println("Enter your choice here: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
			case 7:
				
			case 8:
				System.out.println("Logging out...");
				main.menu();
				break;
				
			default:
				System.out.println("Invalid choice. Choices are between 1 to 8.");
			}
		} while (choice != 8);
	}
	
	public Hashtable<String, String> studentLogin() {
		studentLogin.put("student1", "studentpw1");
		studentLogin.put("student2", "studentpw2");
		studentLogin.put("student3", "studentpw3");
		studentLogin.put("student4", "studentpw4");
		
		return studentLogin;
	}
}
