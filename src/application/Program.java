package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();		
		product.addProduct(quantity);
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int removeProduct = sc.nextInt();
		product.removeProduct(removeProduct);
		System.out.println();
		System.out.println("Updated data: " + product.toString());
					
		sc.close();
	}

}
