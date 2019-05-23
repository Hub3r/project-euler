import java.util.*;
public class largestPrimeFactor {
    public static void main(String[] args) {
        long num = 600851475143L;
        ArrayList<Long> primeFactors = factors(num);
        Collections.sort(primeFactors);
        System.out.println(primeFactors.get(primeFactors.size() - 1));
    }

    public static ArrayList<Long> factors(long value) {
        long temp = value;
        ArrayList<Long> primes = new ArrayList<Long>();
        for(long i = 2; i < temp; i++) {
            while(temp % i == 0) {
                primes.add(i);
                temp = temp/i;
            }
        }
        if(temp > 2) {
            primes.add(temp);
        }
        return primes;
    }
}
