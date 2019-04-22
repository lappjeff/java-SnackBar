package snackBar;

public class VendingMachine
{
  private static int maxId = 0;
  private int id;
  private String name;

  public VendingMachine(String name)
  {
    maxId++;
    id = maxId;

    this.name = name;
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

  @Override
  public String toString()
  {
    String rtnStr = "id: " + id + "\n" +
                    "name: " + name;
    return rtnStr;
  }
}
