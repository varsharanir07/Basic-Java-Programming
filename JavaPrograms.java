import java.util.*;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        uniqueCharacters(sc);
        firstNonRepeating(sc);
        frequencyASCII(sc);
        frequencyUnique(sc);
        frequencyNested(sc);
        palindromeCheck(sc);
        anagramCheck(sc);
        calendarProgram(sc);
        deckOfCards();

        sc.close();
    }

    // 1️⃣ Unique Characters
    public static void uniqueCharacters(Scanner sc) {
        System.out.println("Enter text:");
        String text = sc.next();

        char[] result = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) result[index++] = text.charAt(i);
        }

        System.out.print("Unique chars: ");
        for (int i = 0; i < index; i++)
            System.out.print(result[i] + " ");
        System.out.println("\n");
    }

    // 2️⃣ First Non-Repeating
    public static void firstNonRepeating(Scanner sc) {
        String text = sc.next();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                System.out.println("First non-repeating: " + text.charAt(i));
                break;
            }
        }
        System.out.println();
    }

    // 3️⃣ Frequency using ASCII
    public static void frequencyASCII(Scanner sc) {
        String text = sc.next();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        System.out.println("Char\tFreq");
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                System.out.println((char)i + "\t" + freq[i]);

        System.out.println();
    }

    // 4️⃣ Frequency using Unique
    public static void frequencyUnique(Scanner sc) {
        String text = sc.next();

        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            for (int j = 0; j < text.length(); j++)
                if (text.charAt(i) == text.charAt(j)) count++;

            boolean printed = false;

            for (int k = 0; k < i; k++)
                if (text.charAt(i) == text.charAt(k)) printed = true;

            if (!printed)
                System.out.println(text.charAt(i) + " -> " + count);
        }
        System.out.println();
    }

    // 5️⃣ Frequency using Nested loops
    public static void frequencyNested(Scanner sc) {
        String text = sc.next();
        char[] arr = text.toCharArray();

        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0')
                System.out.println(arr[i] + " -> " + freq[i]);

        System.out.println();
    }

    // 6️⃣ Palindrome (3 methods)
    public static void palindromeCheck(Scanner sc) {
        String text = sc.next();

        // Method 1
        boolean flag = true;
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                flag = false;
                break;
            }
            start++; end--;
        }

        System.out.println("Palindrome (Loop): " + flag);

        // Method 2 Recursive
        System.out.println("Palindrome (Recursion): " + isPalindrome(text, 0, text.length()-1));

        // Method 3 Reverse
        String rev = "";
        for (int i = text.length()-1; i >= 0; i--)
            rev += text.charAt(i);

        System.out.println("Palindrome (Reverse): " + text.equals(rev));
        System.out.println();
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start+1, end-1);
    }

    // 7️⃣ Anagram
    public static void anagramCheck(Scanner sc) {
        String s1 = sc.next();
        String s2 = sc.next();

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) freq[s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++) freq[s2.charAt(i)]--;

        boolean anagram = true;

        for (int f : freq)
            if (f != 0) anagram = false;

        System.out.println("Anagram: " + anagram);
        System.out.println();
    }

    // 8️⃣ Calendar
    public static void calendarProgram(Scanner sc) {
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year%4==0 && year%100!=0) || year%400==0)
            days[2]=29;

        int y0 = year - (14 - month)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12*((14-month)/12) - 2;
        int d0 = (1 + x + (31*m0)/12)%7;

        System.out.println(months[month]+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i=0;i<d0;i++) System.out.print("    ");

        for (int i=1;i<=days[month];i++) {
            System.out.printf("%3d ",i);
            if ((i+d0)%7==0) System.out.println();
        }
        System.out.println("\n");
    }

    // 9️⃣ Deck of Cards
    public static void deckOfCards() {

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        int n = suits.length * ranks.length;
        String[] deck = new String[n];

        int index = 0;

        for (String s : suits)
            for (String r : ranks)
                deck[index++] = r + " of " + s;

        // Shuffle
        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random()*(n-i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }

        // Display first 10 cards
        System.out.println("Shuffled Cards:");
        for (int i = 0; i < 10; i++)
            System.out.println(deck[i]);

        System.out.println();
    }
}