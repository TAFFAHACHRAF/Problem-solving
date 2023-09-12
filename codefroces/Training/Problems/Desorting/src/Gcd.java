import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbTests = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbTests; i++) {
            long input;
            input=sc.nextLong();
            System.out.println(input / 2);
        }
    }

    /*public static long maxGCD(long n) {
        long maxGCD = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                long currentGCD = gcd(a, b);
                if (currentGCD > maxGCD) {
                    maxGCD = currentGCD;
                }
            }
        }
        return maxGCD;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    */
    
}
