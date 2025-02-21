import java.util.Scanner;

public class TrafficCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Speed limit
        int speedLimit = 90;

        System.out.println("=== Traffic Fine Calculator ===");
        System.out.print("Enter your speed (km/h): ");
        int speed = scanner.nextInt();

        if (speed <= speedLimit) {
            System.out.println("You are within the speed limit. Drive safely!");
        } else {
            int fine = 0;

            switch ((speed > 130) ? 3 : (speed > 110) ? 2 : 1) {
                case 1:
                    fine = 1000;
                    System.out.println("You exceeded the speed limit! Fine: " + fine + " TL");
                    break;
                case 2:
                    fine = 2000;
                    System.out.println("You exceeded the speed limit significantly! Fine: " + fine + " TL");
                    break;
                case 3:
                    System.out.println("You exceeded 130 km/h! Your license has been revoked!");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }
}
