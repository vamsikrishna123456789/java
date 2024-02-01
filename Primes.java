public class Primes
{
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 50;
        int count = countPrimesInRange(startRange, endRange);
        System.out.println("Number of prime numbers between " + startRange + " and " + endRange + " is: " + count);
    }
    static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    static int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}