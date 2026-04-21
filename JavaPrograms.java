import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        factorsProgram(sc);
        recursiveSum(sc);
        leapYear(sc);
        unitConverter(sc);
        studentVote(sc);
        friends(sc);
        numberAnalysis(sc);
        bmiProgram(sc);
        quadratic(sc);
        randomArray(sc);

        sc.close();
    }

    // 1️⃣ Factors Program
    public static void factorsProgram(Scanner sc) {
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        int sum = 0, product = 1, squareSum = 0;

        for (int f : factors) {
            sum += f;
            product *= f;
            squareSum += Math.pow(f, 2);
        }

        System.out.println("Factors:");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Sum of Squares = " + squareSum);
        System.out.println();
    }

    // 2️⃣ Recursive Sum
    public static void recursiveSum(Scanner sc) {
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int rec = sumRec(n);
        int formula = n * (n + 1) / 2;

        System.out.println("Recursive = " + rec);
        System.out.println("Formula = " + formula);
        System.out.println();
    }

    public static int sumRec(int n) {
        if (n == 0) return 0;
        return n + sumRec(n - 1);
    }

    // 3️⃣ Leap Year
    public static void leapYear(Scanner sc) {
        System.out.println("Enter year:");
        int y = sc.nextInt();

        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

        System.out.println();
    }

    // 4️⃣ Unit Converter (basic)
    public static void unitConverter(Scanner sc) {
        System.out.println("Enter km:");
        double km = sc.nextDouble();

        double miles = km * 0.621371;

        System.out.println("Miles = " + miles);
        System.out.println();
    }

    // 5️⃣ Student Vote
    public static void studentVote(Scanner sc) {
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age:");
            ages[i] = sc.nextInt();

            if (ages[i] >= 18)
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }

        System.out.println();
    }

    // 6️⃣ Friends (Youngest & Tallest)
    public static void friends(Scanner sc) {
        int[] age = new int[3];
        int[] height = new int[3];

        System.out.println("Enter ages:");
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();

        System.out.println("Enter heights:");
        for (int i = 0; i < 3; i++) height[i] = sc.nextInt();

        int minAge = age[0], maxHeight = height[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) minAge = age[i];
            if (height[i] > maxHeight) maxHeight = height[i];
        }

        System.out.println("Youngest age = " + minAge);
        System.out.println("Tallest height = " + maxHeight);
        System.out.println();
    }

    // 7️⃣ Number Analysis
    public static void numberAnalysis(Scanner sc) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 0) {
                if (arr[i] % 2 == 0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        if (arr[0] > arr[4]) System.out.println("First greater");
        else if (arr[0] < arr[4]) System.out.println("Last greater");
        else System.out.println("Equal");

        System.out.println();
    }

    // 8️⃣ BMI Program
    public static void bmiProgram(Scanner sc) {
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight(kg) and height(cm):");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();

            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);

            System.out.println("BMI = " + data[i][2]);
        }

        System.out.println();
    }

    // 9️⃣ Quadratic Equation
    public static void quadratic(Scanner sc) {
        System.out.println("Enter a b c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots: " + r1 + ", " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Root: " + r);
        } else {
            System.out.println("No real roots");
        }

        System.out.println();
    }

    // 🔟 Random Array
    public static void randomArray(Scanner sc) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
            System.out.print(arr[i] + " ");
        }

        int min = arr[0], max = arr[0], sum = 0;

        for (int x : arr) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        double avg = (double) sum / arr.length;

        System.out.println("\nAvg = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();
    }
}