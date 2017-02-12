public class Weapon
{
  int damage;
  String name;
  int weight;
  
  public int getDamage()
  {
    return damage;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getWeight()
  {
    return weight;
  }
  
  public void examine()
  {
    System.out.println(name + " " + weight + " " + damage);
  }
}