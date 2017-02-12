public class Item
{
  String name;
  int weight;
  
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
    System.out.println(name + weight);
  }
  
}
