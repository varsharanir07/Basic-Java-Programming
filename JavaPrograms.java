import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        footballHeights();
        numberChecker(sc);
        otpProgram();
        collinear(sc);
        euclidean(sc);

        sc.close();
    }

    // 1️⃣ Football Heights
    public static void footballHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
            System.out.print(heights[i] + " ");
        }

        int sum = 0, min = heights[0], max = heights[0];

        for (int h : heights) {
            sum += h;
            min = Math.min(min, h);
            max = Math.max(max, h);
        }

        double mean = (double) sum / heights.length;

        System.out.println("\nShortest = " + min);
        System.out.println("Tallest = " + max);
        System.out.println("Mean = " + mean);
        System.out.println();
    }

    // 2️⃣ Number Checker
    public static void numberChecker(Scanner sc) {
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int temp = num, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        for (int d : digits) sum += d;

        // Armstrong
        int arm = 0;
        for (int d : digits)
            arm += Math.pow(d, count);

        System.out.println("Armstrong: " + (arm == num));

        // Harshad
        System.out.println("Harshad: " + (num % sum == 0));

        System.out.println();
    }

    // 3️⃣ OTP Program
    public static void otpProgram() {
        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {
            otp[i] = (int)(Math.random() * 900000) + 100000;
            System.out.print(otp[i] + " ");
        }

        boolean unique = true;

        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j]) unique = false;
            }
        }

        System.out.println("\nAll OTPs unique: " + unique);
        System.out.println();
    }

    // 4️⃣ Collinear Points
    public static void collinear(Scanner sc) {
        System.out.println("Enter x1 y1 x2 y2 x3 y3:");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));

        if (area == 0)
            System.out.println("Collinear");
        else
            System.out.println("Not Collinear");

        System.out.println();
    }

    // 5️⃣ Euclidean Distance & Line
    public static void euclidean(Scanner sc) {
        System.out.println("Enter x1 y1 x2 y2:");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        System.out.println("Distance = " + distance);
        System.out.println("Line: y = " + m + "x + " + b);
        System.out.println();
    }
}