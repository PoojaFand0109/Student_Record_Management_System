package com.java.student_record;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n=====Student Management System====");

			System.out.println("1.Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5. Exit");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter ID:");
				int id = sc.nextInt();

				System.out.println("Enter Name:");
				String name = sc.next();

				System.out.println("Enter marks:");
				double marks = sc.nextDouble();

				students.add(new Student(id, name, marks));
				System.out.println("Student added successfully");
				break;

			case 2:
				System.out.println("\n---Student List---");
				if (students.isEmpty()) {
					System.out.println("No student found.");
				} else {
					for (Student s : students) {
						s.display();
					}
				}
				break;

			case 3:
				// Update Student
				System.out.print("Enter Student ID to update: ");
				int updateId = sc.nextInt();
				boolean foundUpdate = false;
				for (Student s : students) {
					if (s.id == updateId) {
						sc.nextLine(); // Consume newline
						System.out.print("Enter new name: ");
						s.name = sc.nextLine();
						System.out.print("Enter new marks: ");
						s.marks = sc.nextDouble();
						System.out.println("Student updated successfully.");
						foundUpdate = true;
						break;
					}
				}
				if (!foundUpdate) {
					System.out.println("Student with ID " + updateId + " not found.");
				}
				break;

			case 4:
				// Delete Student
				System.out.print("Enter Student ID to delete: ");
				int deleteId = sc.nextInt();
				boolean foundDelete = false;
				for (Student s : students) {
					if (s.id == deleteId) {
						students.remove(s);
						System.out.println("Student deleted successfully.");
						foundDelete = true;
						break;
					}
				}
				if (!foundDelete) {
					System.out.println("Student with ID " + deleteId + " not found.");
				}
				break;

			case 5:
				// Exit
				System.out.println("Exiting the program...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid option. Please try again.");
			}

		} while (choice != 5);

	}

}
