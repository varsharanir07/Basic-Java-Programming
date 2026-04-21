import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        compareStrings(sc);
        substringProgram(sc);
        charArrayProgram(sc);
        nullPointerDemo();
        stringIndexDemo(sc);
        illegalArgumentDemo(sc);
        numberFormatDemo(sc);
        arrayIndexDemo();
        upperCaseProgram(sc);
        lowerCaseProgram(sc);

        sc.close();
    }

    // 1️⃣ Compare Strings
    public static void compareStrings(Scanner sc) {
        String s1 = sc.next();
        String s2 = sc.next();

        boolean result = true;

        if (s1.length() != s2.length()) result = false;
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    result = false;
            }
        }

        System.out.println("Manual: " + result);
        System.out.println("Built-in: " + s1.equals(s2));
        System.out.println();
    }

    // 2️⃣ Substring
    public static void substringProgram(Scanner sc) {
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub = "";

        for (int i = start; i < end; i++)
            sub += text.charAt(i);

        String built = text.substring(start, end);

        System.out.println("Manual: " + sub);
        System.out.println("Built-in: " + built);
        System.out.println();
    }

    // 3️⃣ Char Array
    public static void charArrayProgram(Scanner sc) {
        String text = sc.next();

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++)
            arr[i] = text.charAt(i);

        char[] built = text.toCharArray();

        boolean same = true;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != built[i]) same = false;

        System.out.println("Arrays equal: " + same);
        System.out.println();
    }

    // 4️⃣ NullPointerException
    public static void nullPointerDemo() {
        try {
            String text = null;
            text.length();
        } catch (Exception e) {
            System.out.println("NullPointerException handled");
        }
        System.out.println();
    }

    // 5️⃣ StringIndexOutOfBounds
    public static void stringIndexDemo(Scanner sc) {
        try {
            String text = sc.next();
            System.out.println(text.charAt(100));
        } catch (Exception e) {
            System.out.println("StringIndexOutOfBounds handled");
        }
        System.out.println();
    }

    // 6️⃣ IllegalArgumentException
    public static void illegalArgumentDemo(Scanner sc) {
        try {
            String text = sc.next();
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("IllegalArgumentException handled");
        }
        System.out.println();
    }

    // 7️⃣ NumberFormatException
    public static void numberFormatDemo(Scanner sc) {
        try {
            String text = sc.next();
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("NumberFormatException handled");
        }
        System.out.println();
    }

    // 8️⃣ ArrayIndexOutOfBounds
    public static void arrayIndexDemo() {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBounds handled");
        }
        System.out.println();
    }

    // 9️⃣ Uppercase Conversion
    public static void upperCaseProgram(Scanner sc) {
        sc.nextLine();
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else
                result += ch;
        }

        System.out.println("Manual: " + result);
        System.out.println("Built-in: " + text.toUpperCase());
        System.out.println();
    }

    // 🔟 Lowercase Conversion
    public static void lowerCaseProgram(Scanner sc) {
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                result += (char)(ch + 32);
            else
                result += ch;
        }

        System.out.println("Manual: " + result);
        System.out.println("Built-in: " + text.toLowerCase());
        System.out.println();
    }
}