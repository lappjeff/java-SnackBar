package snackBar;

public class Customer
{
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.cash = cash;
  }

  public double getCash()
  {
    return cash;
  }

  public void setCash (double cash)
  {
    this.cash = cash;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    this.name = newName;
  }

  @Override
  public String toString()
  {
    String rtnStr = "id: " + id + "\n" + "name: " + name + "\n";
    return rtnStr;
  }

}
