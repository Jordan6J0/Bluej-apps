
/**
 * Write a description of class Course here.
 *
 * @author Jordan Njie
 * @version 0.1 03/10/20
 */
public class Course
{
    private String title;
    private int code;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, int code)
    {
        this.title = title;
        this.code = code;
    }

    public void print()
    {
        System.out.println("Course " + title + " code " + code);
    }
}
