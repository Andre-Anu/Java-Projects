/**
 * Assignment 6
 * André Martins
 * 03/07/2023
 * 13:00
*/

import java.util.Scanner;

public class MovieTicketTestHarness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------");
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();
        ticket.setMovieName(movieName);

        System.out.print("Enter the ticket number: ");
        int ticketNumber = scanner.nextInt();
        ticket.setTicketNumber(ticketNumber);

        System.out.print("Enter the theatre number: ");
        int theatreNumber = scanner.nextInt();
        ticket.setTheatreNumber(theatreNumber);

        System.out.print("Enter the price of the ticket: ");
        double ticketPrice = scanner.nextDouble();
        MovieTicket.ticketPrice = ticketPrice;

        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Ticket Number: " + ticket.getTicketNumber());
        System.out.println("Theatre Number: " + ticket.getTheatreNumber());
        System.out.println("Ticket Price: " + MovieTicket.ticketPrice);
        System.out.println("Tax Amount: " + MovieTicket.calculateTax());

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter a movie name to inquire about its run dates: ");
        String inquireMovieName = scanner.nextLine();
        String movieRunDates = MovieTicket.inquireMovieRunDates(inquireMovieName);
        System.out.println("Movie Run Dates: " + movieRunDates);

        System.out.print("Enter a ticket number to inquire about its run dates: ");
        int inquireTicketNumber = scanner.nextInt();
        String ticketRunDates = MovieTicket.inquireMovieRunDates(inquireTicketNumber);
        System.out.println("Ticket Run Dates: " + ticketRunDates);

        String palindromeResult = ticket.checkPalindrome();
        System.out.println("Palindrome Check: " + palindromeResult);

        scanner.close();
    }
}
