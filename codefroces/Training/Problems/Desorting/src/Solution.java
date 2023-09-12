import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbTests = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbTests; i++) {
            int size = sc.nextInt();
            long[] t = new long[size];

            for (int j = 0; j < size; j++) {
                t[j] = sc.nextInt();
            }
            System.out.println(minimumOperationsToUnsort_V3(size, t));
        }
    }

    public static long minimumOperationsToUnsort_V3(int size, long[] array) {
        if(size == 2)
            return Math.abs(array[1] - array[0]) / 2 + 1;

        long lastMOTU;
        long currentMOTU;
        long diff=Math.abs(array[1] - array[0]);
        currentMOTU = lastMOTU = diff / 2 + 1;

        for (int i = 1; i < size - 1; i++) {
            if(!(array[i] < array[i+1]))
                return 0;

            diff = array[i+1] - array[i];

            currentMOTU = diff / 2 + 1;

            currentMOTU = Math.min(lastMOTU,currentMOTU);
        }
        return currentMOTU;
    }

}

