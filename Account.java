import java.util.Scanner;

public class Account { private double balance;
    private String password;
    private int attemptsLeft;

    public Account(double initialBalance, String password) {
        this.balance = initialBalance;
        this.password = password;
        this.attemptsLeft = 3;
    }

    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            System.out.print("Please enter the 4-digit pass: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                    break;
                } else {
                    System.out.println("Insufficient funds.");
                    break;
                }
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Incorrect password. " + attemptsLeft + " attempts left.");
                } else {
                    System.out.println("Your account has been blocked, please try again later.");
                }
            }
        }

        scanner.close();
    }

}
