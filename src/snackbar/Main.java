package snackbar;

public class Main {

  private static void runProgram() {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Alex", 33.14);
    Customer c3 = new Customer("Sarena", 25.50);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack snack1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack snack3 = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack snack4 = new Snack("Soda", 24, 2.50, v2.getId());
    Snack snack5 = new Snack("Water", 20, 2.75, v2.getId());

    System.out.println("\n*** Program Running ***");
    System.out.println(c1.getCash());
    System.out.println(snack4.getQuantity());
    System.out.println(c1.buySnack(snack4, 3));
    System.out.println(c1.getCash());
    System.out.println(snack4.getQuantity());

    System.out.println(c1.buySnack(snack3, 1));
    System.out.println(snack3.getQuantity());

    System.out.println(c2.getCash());
    System.out.println(c2.buySnack(snack4, 2));
    System.out.println(c1.setCash(10));
  }

  public static void main(final String[] args) {
    runProgram();
  }
}
