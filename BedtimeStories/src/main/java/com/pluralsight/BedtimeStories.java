package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Bedtime Stories!");
        System.out.println("Available stories:");
        System.out.println("1.goldilocks.txt");
        System.out.println("2.hansel_and_gretel.txt");
        System.out.println("3. mary_had_a_little_lamb.txt");
        System.out.println("\nChoose the number from 1 to 3");

        int userChoice = userInput.nextInt();
        String file = "";
        if (userChoice == 1) {
            file = "src/main/resources/goldilocks.txt";

        } else if (userChoice == 2) {
            file = "src/main/resources/hansel_and_gretel.txt";

        } else if (userChoice == 3) {
            file = "src/main/resources/mary_had_a_little_lamb.txt";
        } else {
            System.out.println("invalid Input");

        }


        try {

            // create a FileInputStream object pointing to

            // a specific file

            FileInputStream story = new FileInputStream(file);

            // create a Scanner to reference the file to be read

            Scanner scanner = new Scanner(story);

            String input;

            // read until there is no more data

            while (scanner.hasNextLine()) {

                input = scanner.nextLine();

                System.out.println(input);

            }


            // close the scanner and release the resources

            scanner.close();

        } catch (Exception e) {

            System.out.print("That file doesn't exist");

        }


    }


}



