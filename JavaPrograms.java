import java.util.Scanner;

public class JavaPrograms3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        employeeBonus(sc);
        friendsComparison(sc);
        digitAnalysis(sc);

        sc.close();
    }

    // 1️⃣ Employee Bonus Program
    public static void employeeBonus(Scanner sc) {

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--; // repeat input
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
        System.out.println();
    }

    // 2️⃣ Youngest and Tallest Friends
    public static void friendsComparison(Scanner sc) {

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        int minAge = age[0];
        int youngestIndex = 0;

        double maxHeight = height[0];
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (age[i] < minAge) {
                minAge = age[i];
                youngestIndex = i;
            }

            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend is " + names[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex]);
        System.out.println();
    }

    // 3️⃣ Largest and Second Largest Digit
    public static void digitAnalysis(Scanner sc) {

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        num = Math.abs(num); // handle negative numbers

        while (num != 0) {

            digits[index] = num % 10;
            num = num / 10;
            index++;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
        System.out.println();
    }
}