/**
 * Assignment 5 Challenge 4
 * André Martins
 * 20/06/2023
 * 13:00
*/

import java.util.Scanner;

public class AirlineReservationTestHarness
{
    public static void main(String[] args)
    {
        AirlineReservation client1 = new AirlineReservation("Hidetoshi", "Okada", 123, 4, 5678999);
        printClientDetails(client1);
        
        System.out.println("---");

        AirlineReservation client2 = new AirlineReservation();
        fillClientDetails(client2);
        printClientDetails(client2);
    }

    private static void printClientDetails(AirlineReservation client)
    {
        System.out.println("---");

        System.out.println("Passenger Name: " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Flight Number: " + client.getFlightNumber());
        System.out.println("Seat Number: " + client.getSeatNumber());
        System.out.println("Ticket Number: " + client.getTicketNumber());
        System.out.println("Seating Class: " + client.retrieveSeatingClass());
        System.out.println("Substring: " + client.segmentState());

        String noFlyListCode = client.checkNoFlyList();
        if (noFlyListCode.equals("9999"))
        {
            System.out.println("WARNING");
            System.out.println("WARNING");
            System.out.println("WARNING");
            System.out.println("WARNING");
            System.out.println("WARNING");
            System.out.println("WARNING");
            System.out.println("WARNING");
        }
    }

    private static void fillClientDetails(AirlineReservation client)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();
        client.setFirstName(firstName);

        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();
        client.setLastName(lastName);

        System.out.print("Enter Flight Number: ");
        int flightNumber = scan.nextInt();
        client.setFlightNumber(flightNumber);

        System.out.print("Enter Seat Number: ");
        int seatNumber = scan.nextInt();
        client.setSeatNumber(seatNumber);

        System.out.print("Enter Ticket Number: ");
        int ticketNumber = scan.nextInt();
        client.setTicketNumber(ticketNumber);

        scan.close();
    }
}