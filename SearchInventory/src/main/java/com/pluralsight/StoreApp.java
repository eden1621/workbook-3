package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<ProductJava.Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            ProductJava.Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
//our getInventory method that create an array-list of products and returns it
    public static ArrayList<ProductJava.Product> getInventory() {
        ArrayList<ProductJava.Product> inventory = new ArrayList<ProductJava.Product>();

        // this method loads product objects into inventory // and its details are not shown
        inventory.add( new Product(id: 1, name: "product1",price:45.89f) );
        inventory.add( new Product(id: 2, name: "icecream",price:5.99) );
        inventory.add( new Product(id: 3, name: "chips",price:10.78) );
        inventory.add( new Product(id: 4, name: "fruit",price:22.99) );
        inventory.add( new Product(id: 5, name: "veg",price:34.99) );

    //open inventory.csv files
        //loop over each line in the csv
        //create a product by splitting the line on the
        //create a product using the product class
        //add that product to the inventory array list using inventory.add

        return inventory;
    }
}








