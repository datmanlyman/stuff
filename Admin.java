package project;

import java.util.*;
import java.io.*;

public class Admin {
	private Hashtable<String, String> adminLogin = new Hashtable<String, String>();
	MainApp main = new MainApp();
	
	public void Admin() {

	}
	
	public Hashtable<String, String> adminLogin() {		
		adminLogin.put("admin1", "adminpw1");
		adminLogin.put("admin2", "adminpw2");
		adminLogin.put("admin3", "adminpw3");
		adminLogin.put("admin4", "adminpw4");
		
		return adminLogin;
	}
	
	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1. Add a new course");
			System.out.println("2. Add a new index group");
			System.out.println("3. Update existing course");
			System.out.println("4. Check vacancy for an existing index group");
			System.out.println("5. Add a new student");
			System.out.println("6. Edit student access periods");
			System.out.println("7. Print list of students by index group number");
			System.out.println("8. Print list of students by course");
			System.out.println("9. Logout");
			System.out.println("Enter your choice here: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				addCourse();
				break;
				
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
			case 7:
				
			case 8:
				
			case 9:
				System.out.println("Logging out...");
				main.menu();
				break;
				
			default:
				System.out.println("Invalid choice. Choices are between 1 to 9.");
			}
		} while (choice != 9);
	}
	
	public String addCourse() {
		Scanner sc = new Scanner(System.in);
		int vacancies = 20;
		int j = 0;
		int n = 0;
		
		System.out.println("Course code: ");
		String code = sc.nextLine();
		System.out.println("Name of the course: ");
		String course = sc.nextLine();
		
	    try {
	        File myObj = new File(code + ".txt");
	        if (myObj.createNewFile()) {
	          System.out.println("Course created: " + myObj.getName());
	          
				try (FileWriter fw = new FileWriter(code + ".txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)){
//						out.println("Vacancies: ");
//						out.println("End node: " + path.get(path.size()-1).getId());
//						out.println("Path to nearest hopital number " + Integer.toString(i+1) + ": " + path.toString());
//						out.println("\n");
						
					} catch (IOException e) {
						System.out.println("An error had occurred.");
					}
	        } else {
	          System.out.println("Course code already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		return "Course Added";
	}
}
