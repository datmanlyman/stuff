package project;

import java.util.Scanner;
import java.io.*;

import project.Admin;

public class MainApp {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin();
		Student student = new Student();
		Boolean login = false;
				
		while (login == false) {
			System.out.println("Login ID: ");
			String loginID = sc.nextLine();
			System.out.println("");
			
			System.out.println("Password: ");
			String password = sc.nextLine();
			System.out.println("");
			
			//check if the login ID is inside the hashtable, if it is check if it is the correct password
			if (admin.adminLogin().get(loginID) != null && password.equals(admin.adminLogin().get(loginID))) {
				System.out.println("Welcome, " + loginID + ". What would you like to do today?");
				login = true;
				admin.adminMenu();
			}
			
			else if (student.studentLogin().get(loginID) != null && password.equals(student.studentLogin().get(loginID))) {
				System.out.println("Welcome, " + loginID + ". What would you like to do today?");
				login = true;
				student.studentMenu();
			}
			
			else {
				System.out.println("Login ID or Password is wrong.");
				System.out.println("");
			}
		}
    }
}
