import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int strLength=sc.nextInt();
            String str=sc.nextLine();
            str=sc.nextLine();
            if(str.length()==strLength){
                System.out.println(DistinctSplit(str));
            }
        }
    } //new 

    public static int DistinctSplit(String str){
        int length=str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i=0;i<length;i++){
            CharSequence temp=str.charAt(i)+"";
            if(newStr.toString().contains(temp)!=true){
                newStr.append(str.charAt(i));
            }
            else{
                return newStr.length()+(distinct(str.substring(newStr.length(),str.length())).toString().length());
            }
        }
        return str.length();
    }

    static StringBuilder distinct(String str) {
        Set<Character> origSet = new LinkedHashSet<>();
        StringBuilder concat = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (origSet.add(str.charAt(i))) {
                concat.append(str.charAt(i));
            }
        }
        return concat;
    }
}