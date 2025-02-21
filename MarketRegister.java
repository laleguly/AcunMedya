import java.util.Scanner;

public class MarketRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Product prices
        double product1 = 15.50; // Example prices
        double product2 = 25.75;
        double product3 = 30.00;
        double totalPrice = 0;

        System.out.println("=== Market Cash Register Program ===");
        System.out.println("1 - Product 1 (" + product1 + " USD)");
        System.out.println("2 - Product 2 (" + product2 + " USD)");
        System.out.println("3 - Product 3 (" + product3 + " USD)");
        System.out.println("0 - Complete Shopping");

        // Loop continues while the user is shopping
        for (;;) {
            System.out.print("Please select a product (Enter 0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit loop when 0 is entered
            }

            switch (choice) {
                case 1:
                    totalPrice += product1;
                    System.out.println("Product 1 added to the cart. Current total: " + totalPrice + " USD");
                    break;
                case 2:
                    totalPrice += product2;
                    System.out.println("Product 2 added to the cart. Current total: " + totalPrice + " USD");
                    break;
                case 3:
                    totalPrice += product3;
                    System.out.println("Product 3 added to the cart. Current total: " + totalPrice + " USD");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 0.");
            }
        }

        // Discount coupon check
        System.out.print("Do you have a discount coupon? (Yes/No): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("Yes")) {
            totalPrice *= 0.9; // Apply 10% discount
            System.out.println("Discount applied! New total: " + totalPrice + " USD");
        }

        System.out.println("Shopping completed. Total amount to pay: " + totalPrice + " USD");

        scanner.close();
    }
}
