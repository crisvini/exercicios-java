package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
