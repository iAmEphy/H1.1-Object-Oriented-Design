import java.util.Scanner; 


public class Method
{
  public static void main(String[] args)
   {
    Scanner keyboard = new Scanner (System.in);
    
    Item portable = new Item();
    
    System.out.println(portable.getName());
    System.out.println(portable.getWeight());
    
    System.out.println();
    
    
    Weapon red = new Weapon();
    System.out.println(red.getDamage());
    System.out.println(red.getName());
    System.out.println(red.getWeight());
    
    System.out.println();
    
    Armor black = new Armor();
    System.out.println(black.getDefense());
    System.out.println(black.getName());
    System.out.println(black.getWeight());
    
    
    System.out.println();
    
    
    Food apple = new Food();
    System.out.println(apple.getNutrition());
    System.out.println(apple.getQuantity());
    System.out.println(apple.getWeight());
    System.out.println(apple.getName());
    
  }
}