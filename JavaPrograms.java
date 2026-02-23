public class JavaPrograms {

    public static void main(String[] args) {

        findAge();
        distributePens();
        calculateAveragePCM();
        calculateProfitLoss();
        calculateUniversityFee();
        calculateEarthVolume();
    }

    // 1. Finding Age
    public static void findAge() {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
        System.out.println();
    }

    // 2. Pen Distribution
    public static void distributePens() {
        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
        System.out.println();
    }

    // 3. Average PCM
    public static void calculateAveragePCM() {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
        System.out.println();
    }

    // 4. Profit & Loss
    public static void calculateProfitLoss() {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage);
        System.out.println();
    }

    // 5. University Fee Discount
    public static void calculateUniversityFee() {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
        System.out.println();
    }

    // 6. Earth Volume
    public static void calculateEarthVolume() {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}