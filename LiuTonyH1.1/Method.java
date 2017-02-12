import java.util.Scanner; 


public class Method
{
  public static void main(String[] args)
   {
    Scanner keyboard = new Scanner (System.in);
    
    Item portable = new Item();
    
    System.out.println(portable.getName());
    System.out.println(portable.getWeight());
    
    
  }
}