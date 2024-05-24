package interface12;

import java.util.Scanner;

//Base class Person
class Person {
 private String firstName;
 private String lastName;

 // Constructor to initialize firstName and lastName
 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Method to get first name
 public String getFirstName() {
     return firstName;
 }

 // Method to get last name
 public String getLastName() {
     return lastName;
 }
}

//Subclass Employee extending Person
class Employee extends Person {
 private double salary;

 // Constructor to initialize firstName, lastName, and salary
 public Employee(String firstName, String lastName, double salary) {
     super(firstName, lastName);
     this.salary = salary;
 }

 // Method to get salary
 public double getSalary() {
     return salary;
 }
}

//Subclass Manager extending Employee
class Manager extends Employee {
 private String post;

 // Constructor to initialize firstName, lastName, salary, and post
 public Manager(String firstName, String lastName, double salary, String post) {
     super(firstName, lastName, salary);
     this.post = post;
 }

 // Method to get post
 public String getPost() {
     return post;
 }
}

//Subclass Citizen extending Person
class Citizen extends Person {
 private String citizenship;

 // Constructor to initialize firstName, lastName, and citizenship
 public Citizen(String firstName, String lastName, String citizenship) {
     super(firstName, lastName);
     this.citizenship = citizenship;
 }

 // Method to get citizenship
 public String getCitizenship() {
     return citizenship;
 }
}

//Main class to test inheritance
public class InheritanceDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Single Inheritance: Employee inherits from Person
     System.out.println("Enter employee details:");
     System.out.print("First Name: ");
     String empFirstName = scanner.nextLine();
     System.out.print("Last Name: ");
     String empLastName = scanner.nextLine();
     System.out.print("Salary: ");
     double salary = scanner.nextDouble();
     Employee employee = new Employee(empFirstName, empLastName, salary);
     System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
     System.out.println("Salary: $" + employee.getSalary());

     // Multi-level Inheritance: Manager inherits from Employee
     System.out.println("\nEnter manager details:");
     scanner.nextLine(); // Consume newline character
     System.out.print("First Name: ");
     String mgrFirstName = scanner.nextLine();
     System.out.print("Last Name: ");
     String mgrLastName = scanner.nextLine();
     System.out.print("Salary: ");
     double mgrSalary = scanner.nextDouble();
     scanner.nextLine(); // Consume newline character
     System.out.print("Post: ");
     String post = scanner.nextLine();
     Manager manager = new Manager(mgrFirstName, mgrLastName, mgrSalary, post);
     System.out.println("Manager Name: " + manager.getFirstName() + " " + manager.getLastName());
     System.out.println("Salary: $" + manager.getSalary());
     System.out.println("Post: " + manager.getPost());

     // Hierarchical Inheritance: Citizen inherits from Person
     System.out.println("\nEnter citizen details:");
     System.out.print("First Name: ");
     String citizenFirstName = scanner.next();
     System.out.print("Last Name: ");
     String citizenLastName = scanner.next();
     System.out.print("Citizenship: ");
     String citizenship = scanner.next();
     Citizen citizen = new Citizen(citizenFirstName, citizenLastName, citizenship);
     System.out.println("Citizen Name: " + citizen.getFirstName() + " " + citizen.getLastName());
     System.out.println("Citizenship: " + citizen.getCitizenship());

     // Close scanner
     scanner.close();
 }
}
