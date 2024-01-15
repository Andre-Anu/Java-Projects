/**
 * Assignment 6
 * André Martins
 * 03/07/2023
 * 13:00
*/

public class MovieTicket
{
    private String movieName;
    private int ticketNumber;
    private int theatreNumber;
    public static double ticketPrice;
    
    public MovieTicket()
    {
        // Default constructor
    }
    
    public MovieTicket(String movieName, int ticketNumber, int theatreNumber)
    {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
    }
    
    public String getMovieName()
    {
        return movieName;
    }
    
    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }
    
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }
    
    public int getTheatreNumber()
    {
        return theatreNumber;
    }
    
    public void setTheatreNumber(int theatreNumber)
    {
        this.theatreNumber = theatreNumber;
    }
    
    public static double calculateTax()
    {
        double taxRate = 0.13; // 13% tax
        return ticketPrice * taxRate;
    }
    
    public static String inquireMovieRunDates(String movieName)
    {
        switch (movieName) {
            case "Die Hard 1":
                return "Jan 1, Jan 2, Jan 3";
            case "Die Hard 2":
                return "Jan 4, Jan 5, Jan 6";
            case "Die Hard 3":
                return "Jan 7, Jan 8, Jan 9";
            case "Die Hard 4":
                return "Jan 10, Jan 11, Jan 12";
            default:
                return "Movie run dates not available.";
        }
    }
    
    public static String inquireMovieRunDates(int ticketNumber)
    {
        switch (ticketNumber)
        {
            case 12345:
                return "Jan 1, Jan 2, Jan 3";
            case 12346:
                return "Jan 4, Jan 5, Jan 6";
            case 12347:
                return "Jan 7, Jan 8, Jan 9";
            case 12348:
                return "Jan 10, Jan 11, Jan 12";
            default:
                return "Movie run dates not available.";
        }
    }
    
    public String checkPalindrome()
    {
        String reversed = new StringBuilder(movieName).reverse().toString();
        if (movieName.equalsIgnoreCase(reversed))
        {
            return "YES!, a Palindrome!!";
        }
        else
        {
            return "Not a Palindrome";
        }
    }
}