package Java_Practice;
import java.util.*;
public class Adult {

	public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Enter the Age");
      int age=in.nextInt();
      
      if(age>18)
      {
    	  System.out.println("The person is adult");
      }
      else
      {
    	  System.out.println("The person is not adult");
      }
      
      
	}

}
