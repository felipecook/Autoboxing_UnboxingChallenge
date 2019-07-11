import java.util.ArrayList;

public class Customer {

  private final String name;

  private ArrayList<Double> transactions = new ArrayList<>();

  public Customer(String name, Double initialAmount) {
    this.name = name;
    this.transactions = new ArrayList<>();
    this.transactions.add(initialAmount);

  }

  public void addTransaction(double amount) {
    this.transactions.add(amount);
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }

  public String getName() {
    return name;
  }
}
