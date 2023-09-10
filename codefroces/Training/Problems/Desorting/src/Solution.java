import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nbTests=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nbTests;i++){
            int size=sc.nextInt();
            int[] t =new int[size];

            for(int j=0;j<size;j++){
                t[j]=sc.nextInt();
            }
            System.out.println(minimumOperationsToUnsort(size,t,1));
        }
    }

    public static int minimumOperationsToUnsort(int size, int[] array, int pickI) {
        int min=minimumOperationsToUnsortHelper(size,array,1,0);
        for(int i=1;i<size;i++)
            min=Math.min(min,minimumOperationsToUnsortHelper(size,array,i,0));
        return min;
    }

    public static int minimumOperationsToUnsortHelper(int size, int[] array, int pickI, int operations) {
        int temp[]=new int[size];
        for(int i=0;i<size;i++)
            temp[i]=array[i];

        if (isSortedArray(size, array)) {
            for (int i = 0; i < pickI; i++) {
                temp[i]++;
            }
            for (int i = pickI; i < size; i++) {
                temp[i]--;
            }
            return minimumOperationsToUnsortHelper(size, temp, pickI, ++operations);
        } else {
            return operations;
        }
    }

    public static boolean isSortedArray(int size, int[] array) {
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
