
public class Main {

    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000.0);

        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());

        account.setOwnerName("Jane Smith");
        account.add(600.0);
        account.withdraw(500.0);

        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}