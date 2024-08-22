package com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        Student student = new Student(name, age, id, address, contact, email);

        System.out.println("\nStudent Details:");
        System.out.println(student);

        scanner.close();
    }
}