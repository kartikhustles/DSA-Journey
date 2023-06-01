public class SimpleSieve {
    public static void simpleSieve(int limit) {
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
        for (int p = 2; p <= limit; p++) {
            if (prime[p] == true) {
                System.out.print(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        simpleSieve(50);
    }
}