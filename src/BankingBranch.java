import java.util.ArrayList;

public class BankingBranch {
  private final String branchName;
  private ArrayList<Customer> enrolledCustomers;

  BankingBranch(String branchName) {
    this.branchName = branchName;
    this.enrolledCustomers = new ArrayList<Customer>();
  }

  public boolean addCustomer (String name, Double initialAmount) {
    if (findCustomer(name) == null) {
      this.enrolledCustomers.add(new Customer(name, initialAmount));
      return true;
    }
    return false;
  }

  public boolean addCustomerTransaction (String customerName, Double amount) {
    Customer existingCustomer = findCustomer(customerName);

    if (existingCustomer != null) {
      existingCustomer.addTransaction(amount);
      return true;
    }
    return false;
  }

  private Customer findCustomer(String customerName) {

    for (Customer enrolledCustomer : this.enrolledCustomers) {
      if (enrolledCustomer.getName().equals(customerName)) {
        return enrolledCustomer;
      }
    }

    return null;
  }

  public String getBranchName() {
    return branchName;
  }
}