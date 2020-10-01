package product.ui;

import product.business.Product;
import product.database.ProductDB;

import java.util.Scanner;

public class TestProductApp {

    public static void main(String args[]) {

        System.out.println("==========Welcome to Margarita's book============");
        Product.displayCodes();//calling static to displayCode
        System.out.println();

            Scanner sc = new Scanner(System.in);
        String choice = "y";
        String input = "y";
        Product product = null;
        double total = 0;

            while (choice.equalsIgnoreCase(input)) {

                System.out.print("Enter product code: ");
                String productCode = sc.nextLine();

                product = ProductDB.getProduct(productCode);

                System.out.println();
                if (product != null) {
                    String displayDescription = product.toString();
                    String displayPriceFormat = product.getPriceFormatted();

                    System.out.println("Description: " + displayDescription);
                    System.out.println("Price:       " + displayPriceFormat);
                } else {
                    System.out.println("Please enter a correct code name, there is not book under this code.");
                }

                System.out.println();
                System.out.println("Product count: " + Product.getCount() + "\n");
                System.out.print("Continue? (y/n): ");
                choice = sc.nextLine();
                if (choice.equals("y")) {
                    System.out.println();
                    Product.displayCodes();

                } else {
                    System.out.println("Thank you for your visit");
                }

            }
            if(product == null){
                throw new NullPointerException("Object is null");
            }
              int totalPurchase = Product.getCount();
            System.out.println("Quantity:: " + totalPurchase);
            total = product.getTotal();
            System.out.println("total:: " + total);
            }
    }

