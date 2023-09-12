import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nbTests = sc.nextInt();
        sc.nextLine();
        for (int t=0; t < nbTests;t++){
            int l=sc.nextInt();
            int r= sc.nextInt();
            for (int i=l;i<=r;i++){
                if(i % l == 0 && i % r == 0){
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    public static int lcm(int a,int b){
        return a*b / gcd(a,b);
    }

    public static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
