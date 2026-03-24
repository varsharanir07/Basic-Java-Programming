import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        digitFrequency(sc);

        sc.close();
    }

    // 1️⃣ Digit Frequency Program
    public static void digitFrequency(Scanner sc) {

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        num = Math.abs(num); // handle negative input

        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Edge case for 0
        if (num == 0) {
            count = 1;
        }

        int[] digits = new int[count];
        int index = 0;

        temp = num;

        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Handle 0 separately
        if (num == 0) {
            digits[0] = 0;
        }

        int[] freq = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Display result
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        System.out.println();
    }
}