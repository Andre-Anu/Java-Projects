/**
 * Assignment 9
 * André Martins
 * 03/08/2023
 * 16:00
*/

import java.util.Scanner;


public class RealEstateTransactionTestHarness {
    public static void main(String[] args) {
        // Create a RealEstateTransaction object with sample data
        RealEstateTransaction transaction = new RealEstateTransaction("116", "Clovelly St", "Toronto", "$5,000,000");

        // Test Method 1: Generate state as one string with lowercase and uppercase letters
        System.out.println("Method 1 Test - Concatenated String: " + transaction.generateStateOneString());

        // Test Method 2: Generate random substring with lowercase and uppercase letters
        System.out.println("Method 2 Test - Random Substring: " + transaction.generateRandomStateOneString());

        // Test Method 3: Encrypt the state with a key character
        Scanner scanner = new Scanner(System.in);
        int inKeyCharacterIndex, firstCharacterIndex;
        while (true) {
            System.out.println("Enter an integer for Character Index: ");
            inKeyCharacterIndex = scanner.nextInt();
            System.out.println("Enter an integer for first Character Index: ");
            firstCharacterIndex = scanner.nextInt();

            if (inKeyCharacterIndex < firstCharacterIndex && inKeyCharacterIndex < transaction.generateStateOneString().length() && firstCharacterIndex < transaction.generateStateOneString().length()) {
                break;
            } else {
                System.out.println("Invalid integer, Please try again.");
            }
        }
        scanner.close();

        String encryptedState = transaction.encryptState(inKeyCharacterIndex, firstCharacterIndex);
        if (encryptedState.equals("1")) {
            System.out.println("Error: Invalid input");
        } else {
            System.out.println("Method 3 Test - Encrypted State: " + encryptedState);
        }
    }
}