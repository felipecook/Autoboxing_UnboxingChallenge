import java.util.ArrayList;

public class Customer {

  private final String name;

  ArrayList<Double> transactions = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }
}
