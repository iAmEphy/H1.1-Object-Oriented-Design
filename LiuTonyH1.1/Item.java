public class Item
{
  String name;
  int weight;
  
  public String getName()
  {
    name = "Something";
    return name;
  }
  
  public int getWeight()
  {
    weight = 10;
    return weight;
  }
  
  public void examine()
  {
    System.out.println(name + weight);
  }
  
}
