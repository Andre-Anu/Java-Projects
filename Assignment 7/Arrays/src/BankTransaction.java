/**
 * Assignment 7
 * André Martins
 * 19/07/2023
 * 15:00
*/

public class BankTransaction
{
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;

    private static int numberOfObjects = 0;

    public BankTransaction(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber)
    {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
        numberOfObjects++;
    }

    // Getters and Setters
    public boolean getCanadianFunds()
    {
        return canadianFunds;
    }

    public void setCanadianFunds(boolean canadianFunds)
    {
        this.canadianFunds = canadianFunds;
    }

    public double getExchangeRate()
    {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    public int getTransactionNumber()
    {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber)
    {
        this.transactionNumber = transactionNumber;
    }

    public long getTransactionReferenceNumber()
    {
        return transactionReferenceNumber;
    }

    public void setTransactionReferenceNumber(long transactionReferenceNumber)
    {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
}
