import java.util.ArrayList;

public class BankingBranch {
  private final String branchName;
  private ArrayList<Customer> enrolledCustomers = new ArrayList<>();

  BankingBranch(String branchName) {
    this.branchName = branchName;
  }

  public void addCustomer (String name) {
    Customer customer = new Customer(name);
    // Needs a check to see about if the customer is already enrolled
    enrolledCustomers.add(customer);
  }
}