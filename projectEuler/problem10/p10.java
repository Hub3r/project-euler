import java.util.*;
public class p10 {
    public static void main(String[] args) {
        long sum = 0L;
        for(int i = 2; i < 2000000; i++) {
            if(!isPrime(i)) {
                sum += i;
           }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
