
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Jordan NJie
 * @version 0.1
 */
public class StockApp
{
    public final int FIRST_ID = 200;
    // Use to get user input
    private InputReader input;

    public static final String QUIT = "quit";
    
    public static final String ADD = "add";
    
    public static final String  PINTALL = "printall";
    
    private StockManager manager;
    
    private StockDemo demo;
    
    private int nextID = FIRST_ID;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
       
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString();
            choice = choice.toLowerCase();
            
            
             
            if(choice.equals("Quit"))
                finished = true;
            else
            {
                executeMenuChoice(choice);
            }
        }
    }
   
    
    
   public void executeMenuChoice(String choice)
   {
       if(choice.equals("add"))
       {
           addProduct();
       }
       else if(choice.equals("remove"))
       {
           removeProducts();
       }
       else if(choice.equals("sell"))
       {
           sellProducts();
       }
       else if(choice.equals("search"))
       {
           findProducts();
       }
       else if(choice.equals("printAll"))
       {
           printAllProducts();
           String value = input.getString();
       }
   }
    
   
   
   public void addProduct()
   {
       System.out.println("Add a new Product");
       System.out.println();
       
       
       System.out.println("Please enter the name of the Product");
       String name = input.getString();
       
       boolean isDuplicate = manager.isDuplicateID(nextID);
       if(isDuplicate) 
       {
           boolean finished = false;
           while(!finished)
           {
               nextID++;
               if(!manager.isDuplicateID(nextID))
               {
                   finished = true;
               }
           }
       }
       
       Product product = new Product(nextID, name);
       manager.addProduct(product);
       
       System.out.println("\nAdded" + product + "to the stock \n");
       nextID++;
       
    }
   
   
    public void removeProducts()
    {
        System.out.println("Remove a new Product");
       System.out.println();
       
       
       System.out.println("Please enter the ID of the Product");
       String number = input.getString();
       
       int id = Integer.parseInt(number);
       
       
       manager.removeProduct(id);
       
       
       
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Minus from product stock");
        System.out.println("    Search:     Look for product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    
    
    public void printAllProducts()
    {
        manager.printAllProducts();
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Jordan Njie ");
        System.out.println("******************************");
    }
}
