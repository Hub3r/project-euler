import java.util.*;

public class p9 {
    public static void main(String[] args) {
//     boolean solved = false;
        int x = 0, y = 0, z = 0;
        for(int a = 3; a < 1000; a++) {
            for(int b = 4; b < 1000; b++) {
                for(int c = 5; c < 1000; c++) {
                    if(isEqualToOneThousand(a, b, c)) {
                        if(isPyTriplet(a, b, c)) {
                            x = a;
                            y = b;
                            z = c;
                        }
                    }
                }
            }
        }
        System.out.println(x * y * z);
    }

    public static boolean isEqualToOneThousand(int x, int y, int z) {
        if(x + y + z == 1000) {
            return true;
        }
        return false;
    }

    public static boolean isPyTriplet(int x, int y, int z) {
        if(x < y && y < z) {
            if((x * x) + (y * y) == (z * z)) {
                return true;
            }
        }
        return false;
    }
}
