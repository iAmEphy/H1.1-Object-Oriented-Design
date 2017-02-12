public class Weapon extends Item
{
  int damage;
  String name;
  int weight;
  
  public int getDamage()
  {
    damage = 1;
    return damage;
  }
  
  public String getName()
  {
    name = "Red";
    return name;
  }
  
  public int getWeight()
  {
    weight = 11;
    return weight;
  }
  
  public void examine()
  {
    System.out.println(name + " " + weight + " " + damage);
  }
}