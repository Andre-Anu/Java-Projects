/**
 * Assignment 3 Challenge 1
 * André Martins
 * 26/05/2023
 * 13:00
*/
public class ChequingAccount
{
    private String firstname;
    private String lastname;
    private double balance;
    private String accountnumber;

    public ChequingAccount(String firstname, String lastname, double balance, String accountnumber)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    public void setfirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getfirstname()
    {
        return firstname;
    }

    public void setlastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getlastname()
    {
        return lastname;
    }

    public void setbalance(double balance)
    {
        this.balance = balance;
    }

    public double getbalance()
    {
        return balance;
    }

    public void setaccountnumber(String accountnumber)
    {
        this.accountnumber = accountnumber;
    }

    public String getaccountnumber()
    {
        return accountnumber;
    }
    
}