import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 7051;
        int correctPin = 3578; // Preset PIN
        int enteredPin;
        boolean loginSuccessful = false;

        System.out.println("📌 Welcome to the ATM!");

        // Ask the user for the correct PIN until they enter it correctly
        while (!loginSuccessful) {
            System.out.print("Please enter your 4-digit PIN: ");
            enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("✅ Login successful!");
                loginSuccessful = true;
            } else {
                System.out.println("❌ Incorrect PIN! Please try again.");
            }
        }

        // Menu operations
        while (true) {
            System.out.println("\n🔹 Please select an option:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // View Balance
                System.out.println("💰 Your Current Balance: " + balance + " USD");

            } else if (choice == 2) {
                // Deposit Money
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = scanner.nextInt();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("✅ " + depositAmount + " USD deposited.");
                    System.out.println("📌 New Balance: " + balance + " USD");
                } else {
                    System.out.println("❌ Invalid amount!");
                }

            } else if (choice == 3) {
                // Withdraw Money (Only multiples of 10)
                System.out.print("Enter the amount to withdraw (Only multiples of 10): ");
                int withdrawAmount = scanner.nextInt();

                if (withdrawAmount % 10 != 0) {
                    System.out.println("❌ Error: You can only withdraw amounts that are multiples of 10!");
                } else if (withdrawAmount > balance) {
                    System.out.println("❌ Insufficient balance! Your current balance is: " + balance + " USD");
                } else if (withdrawAmount > 0) {
                    balance -= withdrawAmount;
                    System.out.println("✅ " + withdrawAmount + " USD withdrawn.");
                    System.out.println("📌 Remaining Balance: " + balance + " USD");
                } else {
                    System.out.println("❌ Invalid amount!");
                }

            } else if (choice == 4) {
                // Exit
                System.out.println("👋 Exiting the ATM. Have a nice day!");
                break;

            } else {
                System.out.println("❌ Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
