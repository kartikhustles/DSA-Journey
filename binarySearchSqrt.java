public class binarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.println(sqrt(n, p));
    }

    static float sqrt(int number, int precision) {
        int start = 0, end = number;
        int mid = 0;

        // variable to store the answer
        double ans = 0.0;

        // for computing integral part
        // of square root of number
        while (start <= end) {
            mid = (start + end) / 2;

            if (mid * mid == number) {
                return mid;
            }

            // incrementing start if integral
            // part lies on right side of the mid
            else if (mid * mid < number) {
                start = mid + 1;
            }

            // decrementing end if integral part
            // lies on the left side of the mid
            else {
                end = mid - 1;
            }
        }

        // For computing the fractional part
        // of square root upto given precision
        double increment = 0.1;
        ans = mid - 1 + increment;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }

            // loop terminates when ans * ans > number
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float) ans;
    }
}