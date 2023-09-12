import java.util.Scanner;

public class EhabAndGcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt(); // Value of x for this test case

            for(int i=1;i<1000;i++){
                for(int j=1;j<1000;j++){
                    int ehabAndGcd=gcd(i,j)+lcm(i,j);
                    if(ehabAndGcd == x){
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }

        scanner.close();
    }


    public static int lcm(int a, int b) {
        // LCM(a, b) = (|a * b|) / GCD(a, b)
        return Math.abs(a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

}
