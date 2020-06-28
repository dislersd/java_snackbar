package snackbar;

public class Snack {
  // fields
  private static int maxId = 0; // keeps track of which id to give to to new snacks
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // methods
  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getCost() {
    return cost;
  }

  public int getVendMachineId() {
    return vendingMachineId;
  }

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setVendMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public void buy(int ammount) {
    this.quantity -= ammount;
  }

  public double totalCost() {
    return cost * quantity;
  }
}