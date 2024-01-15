/**
 * Assignment 7
 * André Martins
 * 19/07/2023
 * 15:00
*/

import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness
{
    public static void main(String[] args)
    {
        BankTransaction[] transactions = new BankTransaction[500];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 500 Bank Transaction Records with random data
        for (int i = 0; i < 500; i++)
        {
            boolean canadianFunds = random.nextBoolean();
            double exchangeRate = random.nextDouble();
            int transactionNumber = random.nextInt(1000);
            long transactionReferenceNumber = random.nextLong();

            transactions[i] = new BankTransaction(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);

            // Print the state of each object along with the unique object number
            System.out.println("Account Number: " + (i + 1));
            System.out.println("Canadian Funds: " + transactions[i].getCanadianFunds());
            System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
            System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
            System.out.println("Transaction Reference Number: " + transactions[i].getTransactionReferenceNumber());
            System.out.println("-----------------------------------");
        }

        // Ask the user if they wish to complete phase two of the test
        System.out.println("Do you wish to complete phase two of the test? (yes/no)");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("yes"))
        {
            // Set the state of each object to the same default value using the appropriate setters
            boolean defaultCanadianFunds = false;
            double defaultExchangeRate = 1.5; // Set your desired default exchange rate
            int defaultTransactionNumber = 0; // Set your desired default transaction number
            long defaultTransactionReferenceNumber = 0L; // Set your desired default reference number

            for (int i = 0; i < 500; i++)
            {
                transactions[i].setCanadianFunds(defaultCanadianFunds);
                transactions[i].setExchangeRate(defaultExchangeRate);
                transactions[i].setTransactionNumber(defaultTransactionNumber);
                transactions[i].setTransactionReferenceNumber(defaultTransactionReferenceNumber);
            }

            // Print the state of each object along with the unique object number after setting the default values
            System.out.println("\nAfter setting default values:");
            for (int i = 0; i < 500; i++)
            {
                System.out.println("Object Number: " + (i + 1));
                System.out.println("Canadian Funds: " + transactions[i].getCanadianFunds());
                System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
                System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
                System.out.println("Transaction Reference Number: " + transactions[i].getTransactionReferenceNumber());
                System.out.println("-----------------------------------");
            }
        }
    }
}