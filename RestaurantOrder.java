import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = 0;
        int choice;

        System.out.println("=== Welcome to the Restaurant ===");
        System.out.println("Menu:");
        System.out.println("1 - Burger (75 TL)");
        System.out.println("2 - Pizza (120 TL)");
        System.out.println("3 - Pasta (90 TL)");
        System.out.println("4 - Salad (50 TL)");
        System.out.println("0 - Complete Order");

        do {
            System.out.print("Select a dish (0 to finish): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 75;
                    System.out.println("Burger added to your order. Current total: " + totalBill + " TL");
                    break;
                case 2:
                    totalBill += 120;
                    System.out.println("Pizza added to your order. Current total: " + totalBill + " TL");
                    break;
                case 3:
                    totalBill += 90;
                    System.out.println("Pasta added to your order. Current total: " + totalBill + " TL");
                    break;
                case 4:
                    totalBill += 50;
                    System.out.println("Salad added to your order. Current total: " + totalBill + " TL");
                    break;
                case 0:
                    System.out.println("Finalizing order...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid dish.");
            }
        } while (choice != 0); // Kullanıcı 0 girene kadar devam eder

        System.out.println("Your total bill: " + totalBill + " TL");
        System.out.println("Thank you for your order! Enjoy your meal! 🍽️");

        scanner.close();
    }
}
