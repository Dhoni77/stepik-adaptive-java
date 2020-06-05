public class BehaviourParametrizationWithLambdaExpressions {

//  You have a class Account (number: String, balance: Long, isLocked: boolean), the list accounts of type List<Account> and the method filter(List<T> elems, Predicate<T> predicate) for filtering the given list of type T by the predicate.
//
//  The class Account has the next methods: getNumber(), getBalance(), isLocked() for getting the values of the corresponding fields.
//
//  Write a code for filtering the accounts list in two ways:
//
//  get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
//  get all non-locked accounts with too much money (balance >= 100 000 000) and save it to the variable accountsWithTooMuchMoney
//  The class Account, the list accounts (java.util.List<Account>) and the method filter(...) will be available during testing.
//
//  Important. Use the given code template for your solution. Do not change it!
//
//  Example of use the filter method. The code below gets only even number from the list.
//
//  List<Integer> numbers = ...List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
//
//  PS: it's often called behaviour parametrization because behaviour of the method filter is dependent of the given predicate.

  // you need to filter List<Account> accounts

//  List<Account> nonEmptyAccounts = filter(accounts, elem->elem.getBalance()>0);// write your code here

//  List<Account> accountsWithTooMuchMoney = filter(accounts, elem->elem.getBalance()>= 100000000& !elem.isLocked);// write your code here

// just an example
// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
// List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
}
