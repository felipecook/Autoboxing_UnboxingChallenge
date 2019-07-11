import java.util.*;

public class Bank {

  private ArrayList<BankingBranch> listOfBranches = new ArrayList<BankingBranch>();

  public void addNewBranch (String branchName) {
    BankingBranch bankingBranch = new BankingBranch(branchName);

    listOfBranches.add(bankingBranch);
  }



}
