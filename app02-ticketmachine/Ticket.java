import java.util.Date;

/**
 * ticket machine issues a ticket with its date and time printed the stop and cost 
 *
 * @author Jordan Njie
 * @version v0.01 09/10/2020
 */
public class Ticket
{
    // att
    
    private String stop;
    
    private int cost;
    
    private Date dt;

    /**
     * Constructor for objects of class Ticket
     * the stop and price, date will hold the current date and time when ticket is given 
     */
    public Ticket(String stop, int cost)
    {
        this.stop = stop;
        this.cost = cost;
        
        dt = new Date();
    }

    public void print()
    {
        System.out.println("Ticket " + stop + "cost : " + cost + " issued " + dt);
    }
}
