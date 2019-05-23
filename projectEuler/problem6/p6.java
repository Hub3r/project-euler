import java.util.*;
public class p6 {
    public static void main(String[] args) {
        System.out.println(sumOfSquares() - squareOfSum());
    }
    public static int sumOfSquares() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += (i * i); 
        }
        return sum;
    }
    public static int squareOfSum() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }
        return (sum * sum);
    }
}
