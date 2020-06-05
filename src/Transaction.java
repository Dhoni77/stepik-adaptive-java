import java.util.Date;

public class Transaction {
    private String uuid;
    private Long sum;
    private Account account;
    private State state;
    private Date created;

    public Transaction(String uuid, Long sum, Date created, State state) {
        this.uuid = uuid;
        this.sum = sum;
        this.state = state;
        this.created = created;
    }

    public Transaction(String uuid, Long sum, Account account, State state, Date created) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
        this.state = state;
        this.created = created;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
