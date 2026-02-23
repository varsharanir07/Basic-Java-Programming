import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        celsiusToFahrenheit(sc);
        fahrenheitToCelsius(sc);
        totalIncome(sc);
        travelDetails(sc);

        sc.close();
    }

    // 1️⃣ Celsius to Fahrenheit
    public static void celsiusToFahrenheit(Scanner sc) {
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is "
                + fahrenheitResult + " fahrenheit");
        System.out.println();
    }

    // 2️⃣ Fahrenheit to Celsius
    public static void fahrenheitToCelsius(Scanner sc) {
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is "
                + celsiusResult + " celsius");
        System.out.println();
    }

    // 3️⃣ Total Income (Salary + Bonus)
    public static void totalIncome(Scanner sc) {
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter bonus:");
        double bonus = sc.nextDouble();

        double income = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + income);
        System.out.println();
    }

    // 4️⃣ Travel Details Program
    public static void travelDetails(Scanner sc) {

        sc.nextLine();  // Clear buffer

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter From City:");
        String fromCity = sc.nextLine();

        System.out.println("Enter Via City:");
        String viaCity = sc.nextLine();

        System.out.println("Enter To City:");
        String toCity = sc.nextLine();

        System.out.println("Enter distance from FromCity to ViaCity (in miles):");
        double fromToVia = sc.nextDouble();

        System.out.println("Enter distance from ViaCity to FinalCity (in miles):");
        double viaToFinalCity = sc.nextDouble();

        System.out.println("Enter time from FromCity to ViaCity (in minutes):");
        double timeFromToVia = sc.nextDouble();

        System.out.println("Enter time from ViaCity to FinalCity (in minutes):");
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934; // miles to km
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " +
                totalDistanceKm + " km and the Total Time taken is "
                + totalTime + " minutes");
    }
}