import java.util.Scanner;

public class StudentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects = 5;
        int[] grades = new int[numberOfSubjects];
        int total = 0;
        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;
        boolean hasLowGrade = false; // 30'un altında not olup olmadığını kontrol eder

        System.out.println("=== Student Grade Calculator ===");

        // Öğrenci notlarını al
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();

            // Toplamı hesapla
            total += grades[i];

            // En yüksek ve en düşük notları belirle
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }

            // 30'un altında not kontrolü
            if (grades[i] < 30) {
                hasLowGrade = true;
            }
        }

        // Ortalama hesapla
        double average = (double) total / numberOfSubjects;
        System.out.println("\nAverage Grade: " + average);

        // Geçme durumu kontrolü
        if (average >= 50) {
            System.out.println("Status: Passed ✅");
        } else {
            System.out.println("Status: Failed ❌");
        }

        // Düşük not uyarısı
        if (hasLowGrade) {
            System.out.println("⚠ Warning: You have subjects with very low grades (below 30)!");
        }

        // En yüksek ve en düşük notları göster
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        scanner.close();
    }
}
