import java.util.Scanner;

public class JavaPrograms2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        votingEligibility(sc);
        numberCheck(sc);
        multiplicationTable(sc);
        storeAndSum(sc);

        sc.close();
    }

    // 1️⃣ Voting Eligibility for 10 Students
    public static void votingEligibility(Scanner sc) {
        int[] age = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }

        System.out.println();
    }

    // 2️⃣ Positive / Negative / Zero + Even/Odd + Compare
    public static void numberCheck(Scanner sc) {
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is positive and even");
                } else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println(arr[i] + " is zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last");
        } else {
            System.out.println("First element is less than last");
        }

        System.out.println();
    }

    // 3️⃣ Multiplication Table
    public static void multiplicationTable(Scanner sc) {
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }

        System.out.println();
    }

    // 4️⃣ Store Numbers Until Limit / Stop + Sum
    public static void storeAndSum(Scanner sc) {
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.println("Enter a number:");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            arr[index] = num;
            index++;

            if (index == 10) {
                break;
            }
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\nTotal = " + total);
        System.out.println();
    }
}