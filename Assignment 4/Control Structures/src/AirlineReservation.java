/**
 * Assignment 5 Challenge 3
 * André Martins
 * 20/06/2023
 * 13:00
*/

public class AirlineReservation
{
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;
    private int ticketNumber;
    
    // Constructor
    public AirlineReservation()
    {
    }
    
    public AirlineReservation(String firstName, String lastName, int flightNumber, int seatNumber, int ticketNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketNumber = ticketNumber;
    }
    
    // Getters and Setters
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    public int getSeatNumber()
    {
        return seatNumber;
    }
    
    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber = seatNumber;
    }
    
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }
    
    // Switch
    public String retrieveSeatingClass()
    {
        switch (seatNumber)
        {
            case 1,2:
                return "First Class";
            case 3,4:
                return "Second Class";
            case 5,6:
                return "Third Class";
            case 7,8:
                return "Fourth Class";
            default:
                return "Unknown";
        }
    }

    public String checkNoFlyList()
    {
       String fullName = firstName + " " + lastName;
       if (fullName.equalsIgnoreCase("Jack Blue") || fullName.equalsIgnoreCase("Jack Green") || fullName.equalsIgnoreCase("Jill White"))
       {
        return "9999";
       }
       else
       {
        return "0000";
       }
    }

    public String segmentState() 
    {
    String fullString = firstName + lastName + flightNumber + seatNumber + ticketNumber;
    int firstNumber = Integer.parseInt(String.valueOf(ticketNumber).substring(0, 1));
    int lastNumber = Integer.parseInt(String.valueOf(ticketNumber).substring(String.valueOf(ticketNumber).length() - 1));

    return fullString.substring(firstNumber, lastNumber);
    }
}