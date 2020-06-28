package snackbar;

public class Customer {
  private static int maxId = 0;

  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCash() {
    return "Customer " + name + " cash on hand $" + cash;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String setCash(double cash) {
    this.cash = cash;
    return name + " added $" + cash + " to wallet";
  }

  public String buySnack(Snack snack, int ammount) {
    this.cash -= snack.getCost() * ammount;
    snack.buy(ammount);
    return name + " bought " + ammount + " " + snack.getName() + " for " + snack.getCost() * ammount;
  }
}