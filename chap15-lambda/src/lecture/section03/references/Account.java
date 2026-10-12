package lecture.section03.references;

public class Account {
    private String ownerName;
    private int balance;

    public Account(String ownerName) {
        ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
