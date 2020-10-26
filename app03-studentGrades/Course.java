  import java.util.Scanner;
/**
 * Write a description of class Course here.
 *
 * @modified by Jordan Njie
 * @version 0.01
 */
public class Course
{
    private String codeNo;
    
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    private String finalGrade;
    
    private int code;
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, int code)
    {
       this.title = title;
       this.codeNo = codeNo;
       this.finalMark = 0;
       this.finalGrade = null;
       
       createModules();
    }

    public void createModules()
    {   //modules for the students 
        module1 = new Module("CO452" , "Programming Concepts");
        module2 = new Module("CO456" , "Web Development");
        module3 = new Module("CO450" , "Computer Architectures");
        module4 = new Module("CO454" , "Digital Technologies And Professional Practise");
    }
    
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
        //print method
        
    }
    
    public void printMoudule()
    {   //print all module marks
        if(courseCompleted())
        {
            System.out.println("Final Mark = " + finalMark);
        }
    
    }
    
    public void setMark(int mark, String codeNo)
    {
      if(module1.getCodeNo() == codeNo)
      {
          module1.awardMark(mark);
        }
    }
    
    
     public void calculateFinalMark()
     {
     if(courseCompleted())
     {
        int totalMark = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        
        finalMark = totalMark / 4;
        
        print();
     }
     else
     {
         
     }
    }
    
    public boolean courseCompleted()
    {
        if((module1.isComplete()) && (module2.isComplete()) && (module3.isComplete()) && (module4.isComplete()))
        {
            return true;
        }
        else return false;
    }
    
    public static void main(String args[])
   {
        /* This program calculates and displays the student grades.
         */
        int marks[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        
        
        for(i=0; i<4; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/4;
        System.out.print("The student Grade is: ");
        if(avg>=70)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<69)
        {
           System.out.print("B");
        } 
        else if(avg>=50 && avg<59)
        {
            System.out.print("C");
        }
        else if(avg>=40 && avg<49)
        {
            System.out.print("D");
        }
         else if(avg>=0 && avg<39)
        {
            System.out.print("F");
    }
    
   }
}