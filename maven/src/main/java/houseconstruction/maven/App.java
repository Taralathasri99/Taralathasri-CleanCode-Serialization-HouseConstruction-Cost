package houseconstruction.maven;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends construction
{
    public static void main( String[] args )
    {
       construction obj=new construction();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the option you want to choose 1.Standard materials 2.Above Standard material 3.High Standard materials");
       int choice=sc.nextInt();
       System.out.println("Enter the total area of the house");
       int area=sc.nextInt();
       System.out.println("Enter you want Automated or not");
       String automated=sc.next();
       if(choice==1)
       {
    	  System.out.println("Construction cost of a house is: Rs "+obj.standardMaterials(area)); 
       }
       else if(choice==2)
       {
    	   System.out.println("Construction cost of a house is: Rs "+obj.aboveStandardMaterials(area)); 
       }
       else if(choice==3 || choice==4)
       {
    	   System.out.println("Construction cost of a house is: Rs "+obj.highStandardMaterials(area,automated)); 
       }
       else
    	   System.out.println("Invalid choice");
    }
}
