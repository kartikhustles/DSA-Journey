public class reverse {
    // // method 1
    // static int sum = 0;

    // static void rev1(int n) {
    // if (n == 0) {
    // return;
    // }
    // int rem = n % 10;
    // sum = (sum * 10) + rem;
    // rev1(n / 10);
    // }

    // public static void main(String[] args) {
    // rev1(4321);
    // System.out.println(sum);
    // }

    public static void main(String[] args) {
        System.out.println(palindrome(1567));
        System.out.println(palindrome(1221));
        System.out.println(palindrome(1));
        System.out.println(palindrome(121));
    }

    static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int place = (int) (Math.log10(n));
        return (n % 10 * (int) Math.pow(10, place)) + reverse(n / 10);
    }

    static boolean palindrome(int n) {
        return n == reverse(n);
    }
}
