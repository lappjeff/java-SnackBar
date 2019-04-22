package snackBar;

public class Main
{
  private static void workWithData()
  {

    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    System.out.println("*** Query Data");

    System.out.println(jane);
    System.out.println(bob);

    System.out.println(food);

    System.out.println(drink);
    System.out.println(office);
  }

  public static void main(String[] args)
  {
    workWithData ();
  }
}
