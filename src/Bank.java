import java.util.*;

public class Bank {

  ArrayList<BankingBranch> listOfBranches = new ArrayList<BankingBranch>();

  public void addNewBranch (String branchName) {
    BankingBranch bankingBranch = new BankingBranch(branchName);

    listOfBranches.add(bankingBranch);
  }

  public class BankingBranch {
    private final String branchName;

    public BankingBranch(String branchName) {
      this.branchName = branchName;
    }

    ArrayList<Customer> enrolledCustomers = new ArrayList<>();

    public void addCustomer (String name) {
      Customer customer = new Customer(name);
      // Needs a check to see about if the customer is already enrolled
      enrolledCustomers.add(customer);
    }
  }

}
