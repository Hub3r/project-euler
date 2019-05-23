import java.util.*;

public class p4 {
    public static void main(String[] args) {
        int currentProduct = 0;
        int reverseProduct = 0;
        int currentMax = 0;
        int minMultiple = 100;
        int maxMultiple = 1000;
        for(int i = minMultiple; i < maxMultiple; i++) {
            for(int j = minMultiple; j < maxMultiple; j++) {
                currentProduct = i * j;
                reverseProduct = reverseNum(currentProduct);
                if(currentProduct == reverseProduct) {
                    if(currentProduct > currentMax) {
                        currentMax = currentProduct;
                    }
                }
            }
        } 
        System.out.println(currentMax);
    }

    public static int reverseNum(int num) {
        int temp = num;
        int x = 0;
        int a = 0;
        while(temp > 0) {
            x = temp % 10;
            a = a * 10 + x;
            temp = temp / 10;
        }
        return a;
    }
}
