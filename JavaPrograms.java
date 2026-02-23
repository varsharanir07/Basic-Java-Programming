import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        calculator(sc);
        triangleArea(sc);
        squareSide(sc);
        distanceConversion(sc);
        totalPurchase(sc);
        quotientRemainder(sc);

        sc.close();
    }

    // Basic Calculator
    public static void calculator(Scanner sc) {
        System.out.println("Enter two numbers:");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number2 != 0 ? number1 / number2 : 0;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);
        System.out.println();
    }

    // Area of Triangle
    public static void triangleArea(Scanner sc) {
        System.out.println("Enter base and height in cm:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaInches + " and sq cm is " + areaCm);
        System.out.println();
    }

    // Side of Square
    public static void squareSide(Scanner sc) {
        System.out.println("Enter perimeter of square:");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);
        System.out.println();
    }

    // Distance Conversion
    public static void distanceConversion(Scanner sc) {
        System.out.println("Enter distance in feet:");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is "
                + yards + " while the distance in miles is " + miles);
        System.out.println();
    }

    // Total Purchase Price
    public static void totalPurchase(Scanner sc) {
        System.out.println("Enter unit price and quantity:");
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice + " if the quantity "
                + quantity + " and unit price is INR " + unitPrice);
        System.out.println();
    }

    // Quotient and Remainder
    public static void quotientRemainder(Scanner sc) {
        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
    }
}