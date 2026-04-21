import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        stringLength(sc);
        splitCompare(sc);
        splitWithLength(sc);
        shortestLongest(sc);
        vowelConsonantCount(sc);
        trimProgram(sc);

        sc.close();
    }

    // 1️⃣ Length without length()
    public static void stringLength(Scanner sc) {
        System.out.println("Enter text:");
        String text = sc.next();

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}

        System.out.println("Manual Length = " + count);
        System.out.println("Built-in Length = " + text.length());
        System.out.println();
    }

    // 2️⃣ Split & Compare
    public static void splitCompare(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] built = text.split(" ");

        boolean same = compareArrays(manual, built);

        System.out.println("Same Result = " + same);
        System.out.println();
    }

    // Manual split
    public static String[] manualSplit(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;

        return words;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;

        return true;
    }

    // 3️⃣ Words with Length
    public static void splitWithLength(Scanner sc) {
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);

        System.out.println("Word\tLength");
        for (String w : words)
            System.out.println(w + "\t" + w.length());

        System.out.println();
    }

    // 4️⃣ Shortest & Longest
    public static void shortestLongest(Scanner sc) {
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);

        String min = words[0], max = words[0];

        for (String w : words) {
            if (w.length() < min.length()) min = w;
            if (w.length() > max.length()) max = w;
        }

        System.out.println("Shortest = " + min);
        System.out.println("Longest = " + max);
        System.out.println();
    }

    // 5️⃣ Vowel & Consonant Count
    public static void vowelConsonantCount(Scanner sc) {
        System.out.println("Enter text:");
        String text = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println();
    }

    // 6️⃣ Trim using charAt()
    public static void trimProgram(Scanner sc) {
        System.out.println("Enter text with spaces:");
        String text = sc.nextLine();

        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        String result = "";

        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        System.out.println("Manual Trim = " + result);
        System.out.println("Built-in Trim = " + text.trim());
        System.out.println();
    }
}