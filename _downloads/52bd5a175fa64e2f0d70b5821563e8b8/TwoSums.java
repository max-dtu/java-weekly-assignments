class TwoSums {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        System.out.println("Please write two positive numbers:");
        var n1 = s.nextInt();
        var n2 = s.nextInt();

        var sum1 = Utils.sum(n1);
        var sum2 = Utils.sum(n2);

        System.out.println("Sum of all numbers from 1 to " + n1 + ": " + sum1);
        System.out.println("Sum of all numbers from 1 to " + n2 + ": " + sum2);

        s.close();
    }
}
