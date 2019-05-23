import java.util.*;

public class p7 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int currentValue = 2;
        while(primes.size() != 10002) {
            if(!isPrime(currentValue)) {
                primes.add(currentValue);
            }
            currentValue++;
        }
 //       System.out.println(primes.size());
        Collections.sort(primes);
        System.out.println(primes.get(10001));
    }

    public static boolean isPrime(int num) {
        boolean flag = false;
        for(int i = 2; i < num / 2; i++) {
           if(num % i == 0) {
               flag = true;
               break;
           }
        }
        return flag;
    }
}
