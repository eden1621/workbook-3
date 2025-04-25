package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductJava {

    public class Product {
        private int id;
        private String name;
        private float price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public float getPrice() {
            return this.price;
        }


        //String that represent the product
        public String toString(){
       return id + " | " + name + " | $" + price;

        }
        public class SearchInventory {
            private static ArrayList<Product> inventory = new ArrayList<>();
        }

        // Method to get the inventory (from a file or hardcoded)
        public static void getInventory() {
            // You can use this method for hardcoded inventory or file-based loading
            loadInventoryFromFile("inventory.csv");
        }

        // Method to load inventory from file
        public static void loadInventoryFromFile(String filename) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());

                    // Create Product and add to inventory
                    Product product = new Product(id, name, price);
                    inventory.add(product);
                }

            }
    }