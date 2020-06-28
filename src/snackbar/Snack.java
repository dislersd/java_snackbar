package snackbar;

public class Snack {
  // fields
  private static int maxId = 0; // helps keep track of which id to give to to new snacks
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;
  
  // methods
  public Snack (String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // getters

  // setter
}