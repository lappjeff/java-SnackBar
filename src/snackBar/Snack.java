package snackBar;

public class Snack
{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public void setId(int newId)
  {
    this.id = newId;
  }

  public int getId()
  {
    return id;
  }

  public void setName(String newName)
  {
    this.name = newName;
  }

  public String getName()
  {
    return name;
  }

  public void setCost(double newCost)
  {
    this.cost = newCost;
  }

  public double getCost()
  {
    return cost;
  }

  public void setVendorId(int newId)
  {
    this.id = newId;
  }

  public int getVendorId()
  {
    return id;
  }

  public void setSnackQuantity(int quantity)
  {
    this.quantity = this.quantity + quantity;
  }

  public String getSnackQuantity()
  {
    return "There are " + quantity + " " + name + "'s left";
  }

  public double sellSnack(int quantity)
  {
    this.quantity = this.quantity - quantity;
    double cost = quantity * this.cost;
    return cost;
  }

  public String getSnackPrice(int quantity)
  {
    double totalCost = quantity * cost;
    return "That will cost you $" + String.valueOf(totalCost);
  }

  @Override
  public String toString()
  {
    String rtnStr = "id: " + id + "\n" +
                    "Snack name: " + name + "\n" +
                    "Quantity remaining: " + quantity + "\n" +
                    "Cost: " + cost + "\n" +
                    "Vendor ID: " + vendingMachineId;
    return rtnStr;
  }

}
