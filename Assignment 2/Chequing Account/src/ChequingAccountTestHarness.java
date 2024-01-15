/**
 * Assignment 3 Challenge 2
 * André Martins
 * 26/05/2023
 * 14:00
*/
public class ChequingAccountTestHarness 
{    public static void main(String[] args)
    {
        ChequingAccount client = new ChequingAccount("Andre", "Martins", 1000000.0, "88888888");
        System.out.println("First Name: "+ client.getfirstname());
        System.out.println("Last Name: "+ client.getlastname());
        System.out.println("Your Balance is: $"+ client.getbalance());
        System.out.println("Account Number: "+ client.getaccountnumber());

        client.setfirstname("Anu");
        client.setlastname("Beuttenmuller");

        System.out.println();
        System.out.println("Update:");
        System.out.println();
        System.out.println("First Name: "+ client.getfirstname());
        System.out.println("Last Name: "+ client.getlastname());
    }
}
