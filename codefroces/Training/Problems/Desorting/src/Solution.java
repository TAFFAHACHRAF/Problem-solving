import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbTests = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbTests; i++) {
            int size = sc.nextInt();
            int[] t = new int[size];

            for (int j = 0; j < size; j++) {
                t[j] = sc.nextInt();
            }
            System.out.println(minimumOperationsToUnsort_V3(size, t));
        }
    }

    public static int minimumOperationsToUnsort_V3(int size, int[] array) {
        int lastMOTU;
        int currentMOTU;
        int diff=array[1] - array[0];
        if(diff %2 == 0){
            currentMOTU = lastMOTU = diff / 2;
        }else {
            currentMOTU = lastMOTU = diff / 2  + 1;
        }

        for (int i = 1; i < size - 1; i++) {
            if(!(array[i] < array[i+1]))
                return 0;

            diff = array[i+1] - array[i];

            if(diff %2 == 0){
                currentMOTU = diff / 2;
            } else {
                currentMOTU = diff / 2 + 1;
            }

            currentMOTU = Math.min(lastMOTU,currentMOTU);
        }
        return currentMOTU;
    }

}

