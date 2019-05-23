import java.util.*;
public class p5 {
    public static void main(String[] args) {
        int smallest = 0;
        boolean solved = false;
        while(!solved) {
            smallest += 2;
            solved = solvable(smallest);
        }
        System.out.println(smallest);
    }
    public static boolean solvable(int num) {
        for(int i = 1; i < 21; i++) {
            if(num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
