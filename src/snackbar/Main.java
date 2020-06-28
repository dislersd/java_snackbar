package snackbar;

public class Main {

  private static void runProgram() {
    Customer c1 = new Customer("David", 20.00);
    Customer c2 = new Customer("Alex", 30.00);
    Customer c3 = new Customer("Sarena", 25.50);

    VendingMachine v1 = new VendingMachine("HallwayVendingMachine");
    VendingMachine v2 = new VendingMachine("CourtyardVendingMachine");

    Snack snack1 = new Snack("Chips", 5, 5.00, v1.getId());
    Snack snack2 = new Snack("Cookie", 3, 6.00, v2.getId());
    Snack snack3 = new Snack("Crackers", 10, 3.50, v1.getId());
    Snack snack4 = new Snack("Fruit Chews", 8, 4.50, v2.getId());

    System.out.println("\n*** Program Running ***");
    System.out.println(c1.getCash());
  }

  public static void main(final String[] args) {
    runProgram();
  }
}
