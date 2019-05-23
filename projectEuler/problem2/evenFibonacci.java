public class evenFibonacci {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        int totalEven = 0;
        while(t2 < 4000000) {
            if(t2 % 2 == 0) {
                totalEven += t2;
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println(totalEven);
    }
}
