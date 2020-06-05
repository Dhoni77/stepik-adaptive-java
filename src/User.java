import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class User {
    private Account account;
    private String login;

    public String getLogin() {
        return login;
    }

    public Account getAccount() {
        return account;
    }

    private static final Set<User> users = new HashSet<>();

    public static Optional<User> findUserByLogin(String login) {
        return users.stream()
                .filter(x -> x.getLogin()
                        .equals(login))
                .findAny();
    }

    public synchronized static void printBalanceIfNotEmpty(String userLogin) {
        if (findUserByLogin(userLogin).isPresent() && findUserByLogin(userLogin).get()
                .getAccount()
                .getBalance() > 0)
            System.out.println(userLogin + ": " + findUserByLogin(userLogin).get()
                    .getAccount()
                    .getBalance());
    }

}
