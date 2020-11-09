import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Jordan Njie 
 * @version V0.01
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliveryProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered ; " + product);
        }
            
        else
        {
            
            System.out.println("Product ID = " + id + "Invalid Product");
        
        }
        
    }
   

    // renames the product 
    public void renameProduct(int id, String newName)
    {
         for(Product product:stock)
         {
            if(product.getID () == id)
        
         {
            product.rename(newName);
            break;
         } 
       }
       
       
     }
    
    
     //sells a product from the stock list
    public void sellProduct(int id, int amount)
    {
      Product product = findProduct(id);
        
        if(product != null)
        {
            printDetails(int id);
            product.sell(amount);
            printDetails(id);
         
        }
      
      
    }
     
    //removes product from the stock list
    public void removeProduct(int id)
      {
        for(Product product:stock){
            if (product.getID() == id)
            {
               stock.remove(product);
                break;
          }
      }
      
      }
    
     /**
     //looks for the product in stock and if not found it will null
     */
     public Product findProduct(int id)
    {
      for(Product product : stock)
      {
          if(product.getID() == id)
       {
                return product;
       }
     }
     
     return null;
    }   
    
    public int numberInStock(int id)
    {
        for (Product product : stock) 
        if(product.getID()== id)
        {
            return product.getQuantity();
        }
        {
            return 0;
        }
    }
    
    /**
     // Print details of the given product. If found,
     //its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println("Jordan's Stock List");
        System.out.println("====================");
        System.out.println();
    }
}