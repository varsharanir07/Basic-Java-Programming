import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        simpleInterest(sc);
        handshakes(sc);
        athleteRounds(sc);
        numberCheck(sc);
        sumNatural(sc);
        minMax(sc);
        division(sc);
        chocolates(sc);
        windChill(sc);
        trigonometry(sc);

        sc.close();
    }

    // 1️⃣ Simple Interest
    public static void simpleInterest(Scanner sc) {
        System.out.println("Enter Principal, Rate, Time:");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
        System.out.println();
    }

    // 2️⃣ Handshakes
    public static void handshakes(Scanner sc) {
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int result = (n * (n - 1)) / 2;

        System.out.println("Handshakes = " + result);
        System.out.println();
    }

    // 3️⃣ Athlete Rounds
    public static void athleteRounds(Scanner sc) {
        System.out.println("Enter 3 sides:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;

        System.out.println("Rounds needed = " + rounds);
        System.out.println();
    }

    // 4️⃣ Positive / Negative / Zero
    public static void numberCheck(Scanner sc) {
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("1");
        else if (num < 0)
            System.out.println("-1");
        else
            System.out.println("0");

        System.out.println();
    }

    // 5️⃣ Sum of n Natural Numbers
    public static void sumNatural(Scanner sc) {
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        System.out.println();
    }

    // 6️⃣ Smallest & Largest
    public static void minMax(Scanner sc) {
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
        System.out.println();
    }

    // 7️⃣ Quotient & Remainder
    public static void division(Scanner sc) {
        System.out.println("Enter number and divisor:");
        int num = sc.nextInt();
        int d = sc.nextInt();

        int q = num / d;
        int r = num % d;

        System.out.println("Quotient = " + q);
        System.out.println("Remainder = " + r);
        System.out.println();
    }

    // 8️⃣ Chocolates Distribution
    public static void chocolates(Scanner sc) {
        System.out.println("Enter chocolates and children:");
        int ch = sc.nextInt();
        int kids = sc.nextInt();

        int each = ch / kids;
        int rem = ch % kids;

        System.out.println("Each gets = " + each);
        System.out.println("Remaining = " + rem);
        System.out.println();
    }

    // 9️⃣ Wind Chill
    public static void windChill(Scanner sc) {
        System.out.println("Enter temperature and wind speed:");
        double t = sc.nextDouble();
        double v = sc.nextDouble();

        double wc = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind Chill = " + wc);
        System.out.println();
    }

    // 🔟 Trigonometric Functions
    public static void trigonometry(Scanner sc) {
        System.out.println("Enter angle in degrees:");
        double angle = sc.nextDouble();

        double rad = Math.toRadians(angle);

        System.out.println("Sin = " + Math.sin(rad));
        System.out.println("Cos = " + Math.cos(rad));
        System.out.println("Tan = " + Math.tan(rad));
        System.out.println();
    }
}