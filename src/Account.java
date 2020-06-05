import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

  private String number;
  private Long balance;
  private boolean isLocked;
  List<Account> accountList;
  List<Transaction> transactions;

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public String getNumber() {
    return number;
  }

  public Long getBalance() {
    return balance;
  }

  public boolean isLocked() {
    return isLocked;
  }

    public Account(String number, Long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    public Account(String number, Long balance, boolean isLocked) {
    this.number = number;
    this.balance = balance;
    this.isLocked = isLocked;
  }

//  List<Account> nonEmptyAccounts = filter(accountList, elem -> elem.getBalance() > 0); // write your code here
//
//  List<Account> accountsWithTooMuchMoney = filter(accountList, elem -> elem.getBalance() >= 100000000 & !elem.isLocked);// write your code here

//  public static <T> List<T> filter(List<T> elems, Predicate<T> condition) {
//    return elems.stream()
//            .filter(condition)
//            .collect(Collectors.toList());
//  }

  public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
    return accounts.stream()
            .filter(account -> account.getBalance() > 0)
            .flatMap(account -> account.getTransactions()
                    .stream()
                    .filter(x->x.getState().equals(State.CANCELED)).map(Transaction::getSum)).mapToLong(Long::longValue).sum();// write your code here
  }

  public static void main(String[] args) {
      ArrayList<Account> ara = new ArrayList<>();
      ara.add(new Account("1", (long) -15000, new ArrayList<Transaction>()));
      ara.add(new Account("2", (long) -10000, new ArrayList<Transaction>()));
      ara.add(new Account("3", (long) -5000, new ArrayList<Transaction>()));
      ara.add(new Account("4", (long) 0, new ArrayList<Transaction>()));
      ara.add(new Account("5", (long) 5000, new ArrayList<Transaction>()));
      ara.add(new Account("6", (long) 10000, new ArrayList<Transaction>()));
      ara.add(new Account("7", (long) 15000, new ArrayList<Transaction>()));
      ara.add(new Account("8", (long) 20000, new ArrayList<Transaction>()));
      ara.add(new Account("9", (long) 25000, new ArrayList<Transaction>()));
      ara.forEach(
              a->a.getTransactions().add(new Transaction("12", (long) 13000, new Date(), State.CANCELED))//every acc get one transaction with 13000
      ) ;
      System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(ara));
  }
}
