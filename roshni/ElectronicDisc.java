package roshni;

import java.util.Scanner;

public class ElectronicDisc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer's address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the amount of purchase: ₹");
        double amount = scanner.nextDouble();

        System.out.print("Enter the type of purchase (L for Laptop, D for Desktop): ");
        char type = scanner.next().charAt(0);

        double discountRate = 0;
        if (amount <= 2500) {
            discountRate = (type == 'L') ? 0.0 : 5.0;
        } else if (amount >= 2501 && amount <= 57000) {
            discountRate = (type == 'L') ? 5.0 : 7.5;
        } else if (amount >= 57001 && amount <= 100000) {
            discountRate = (type == 'L') ? 7.5 : 10.0;
        } else {
            discountRate = (type == 'L') ? 10.0 : 15.0;
        }

        double discount = (discountRate / 100) * amount;
        double netAmount = amount - discount;

        System.out.println("\nCustomer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Amount of Purchase: ₹" + amount);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount: ₹" + discount);
        System.out.println("Net Amount to be Paid: ₹" + netAmount);

        scanner.close();
    }
}
