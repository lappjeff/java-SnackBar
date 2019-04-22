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

    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());


    System.out.println("*** Query Data");

    jane.buySnack(soda.sellSnack(3));
    System.out.println(jane.getCash());
    System.out.println(soda.getSnackQuantity());

  }

  public static void main(String[] args)
  {
    workWithData ();
  }
}
