public class SegmentedAndIncrementSieve {
    public static void simpleSieve(int limit, int lLimit) {
        boolean[] prime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            prime[i] = true;
        }

        // Mark all the multiples of the prime numbers
        for (int p = 2; p * p <= limit; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= limit; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers
        for (int p = lLimit; p <= limit; p++) {
            if (prime[p] == true) {
                System.out.print(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        simpleSieve(50, 10);
    }
    // static void SegSieve(int l, int h) {
    // // step1
    // boolean prime[] = new boolean[h + 1];
    // // step 2
    // for (int p = 2; p * p <= h; p++) {
    // int sm = (l / p) * p;
    // if (sm < l) {
    // sm = sm + p;
    // }
    // for (int i = sm; i <= h; i += p)
    // prime[i] = true;
    // }

    // // step 3 Print all prime numbers
    // for (int i = l; i <= h; i++) {
    // if (prime[i] == false)
    // System.out.print(i + " ");
    // }
    // }

    // public static void main(String[] args) {
    // SegSieve(10, 30);
    // }
}
