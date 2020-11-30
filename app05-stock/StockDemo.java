import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @Mod Jordan Njie 
 * @version V0.01
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random generator;
    
    
    
    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
       generator = new Random();
        this.manager = manager;
        
        // the porduct list
        
       manager.addProduct(new Product(101, "Samsung Galaxy Fold 2"));
       manager.addProduct(new Product(102, "Samsung Galaxy S20 5G"));
       manager.addProduct(new Product(110, "Apple IPhone 12"));
       manager.addProduct(new Product(111, "Apple Ipad air"));
       manager.addProduct(new Product(114, "XBOX X"));
       manager.addProduct(new Product(115, "Playstation 4 Pro"));
       manager.addProduct(new Product(116, "Playstation 5"));
       manager.addProduct(new Product(118, "Google Home"));
       manager.addProduct(new Product(119, "Google Pixel 2"));
       manager.addProduct(new Product(120, "OnePLus 7 Pro"));
    }
    
    //this will run all tests
    public void runDemo()
    {
        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
        
    }
    
    
    private void demoDelivery()
    {
        printHeading("Delivery");
        
        int amount = 0;
        
        for(int id = 101; id <= 120; id++)
        {
            amount = generator.nextInt(10) + 1; 
            manager.deliveryProduct(id,amount);
            amount++;
        }
       
    }
    
    private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
        
         for(int id = 101; id <= 120; id++)
        {
            amount = generator.nextInt(10) + 1; 
            manager.sellProduct(id,amount);
        }
       
        
    }
    
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demo Product"+ verb);
        System.out.println();
        System.out.println();
    }
}