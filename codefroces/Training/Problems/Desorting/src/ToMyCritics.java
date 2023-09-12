import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbTests = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbTests; i++) {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            toMyCritics(a,b,c);
        }
    }

    public static void toMyCritics(int a,int b,int c){
        boolean test=(a+b >= 10) || (a+c >= 10) || (b+c >= 10);
        if(test == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
