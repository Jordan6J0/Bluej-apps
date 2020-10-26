
/**
 * Write a description of class Module here.
 *
 * @modified by Jordan Njie
 * @version 0.01
 */
public class Module
{
    // feilds
    
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        passed = false;
        completed = false;
    }

    public void awardMark(int mark)
    { 
        this.mark = mark;
    }
    
    public int getMark()
    {
        return mark;
    }
    
    //returns module code number
    public String getCodeNo()
    {
        return codeNo;
    }
    
    //if mark is completed 
    public boolean isComplete()
    { 
        return mark >=0;
    }
    
    public void print()
    {
        System.out.println("Module" + title + " " + codeNo + "Mark " + mark);
    }
    
    //get method for title
    public String getTitle()
    {
        return this.title;
    
    }
    
}
