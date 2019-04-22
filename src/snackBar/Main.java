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


    System.out.println("*** \n Jane Does Stuff\n***");


    jane.buySnack(soda.sellSnack(3));
    System.out.println(jane.getCash());
    System.out.println(soda.getSnackQuantity());

    jane.buySnack(pretzel.sellSnack(1));
    System.out.println(jane.getCash());
    System.out.println(pretzel.getSnackQuantity());

    jane.addCash(10);
    System.out.println(jane.getCash());

    jane.buySnack(chocolateBar.sellSnack(1));
    System.out.println(jane.getCash());
    System.out.println(chocolateBar.getSnackQuantity());

    System.out.println("*** \n Bob Does Stuff\n***");

    bob.buySnack(soda.sellSnack(2));
    System.out.println(bob.getCash());
    System.out.println(soda.getSnackQuantity());

    bob.buySnack(pretzel.sellSnack(3));
    System.out.println(bob.getCash());
    System.out.println(pretzel.getSnackQuantity());

    System.out.println("*** \n Other things do stuff\n***");
    pretzel.setSnackQuantity(12);
    System.out.print(pretzel.getSnackQuantity());

  }

  public static void main(String[] args)
  {
    workWithData ();
  }
}
