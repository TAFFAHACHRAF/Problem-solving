import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nbTests=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nbTests;i++){
            int size=sc.nextInt();
            long[] t =new long[size];

            for(int j=0;j<size;j++){
                t[j]=sc.nextInt();
            }
            System.out.println(minimumOperationsToUnsort_V1(size,t,1));
        }
    }

    public static long minimumOperationsToUnsort_V2(int size, long[] array) {
        long min_diff = 99999; // +linfini
        for (int i = 0; i < size - 1; i++) {
            long lastItem = array[i];
            long currentItem = array[i + 1];
            if (currentItem < lastItem)
                return 0;
            long k = (currentItem - lastItem) / 2 + 1;
            min_diff = Math.min(k, min_diff);
        }
        return min_diff;
    }

    public static int minimumOperationsToUnsort_V1(int size, long[] array, int pickI) {
        int min=minimumOperationsToUnsortHelper(size,array,1,0);
        for(int i=1;i<size;i++)
            min=Math.min(min,minimumOperationsToUnsortHelper(size,array,i,0));
        return min;
    }

    public static int minimumOperationsToUnsortHelper(int size, long[] array, int pickI, int operations) {
        if (isSortedArray(array,0,size-1)) {
            long[] modifiedArray = Arrays.copyOf(array, size); // Create a copy of the original array
            for (int i = 0; i < pickI; i++) {
                modifiedArray[i]++;
            }
            for (int i = pickI; i < size; i++) {
                modifiedArray[i]--;
            }
            return minimumOperationsToUnsortHelper(size, modifiedArray, pickI, ++operations);
        } else {
            return operations;
        }
    }

    public static boolean isSortedArray(long array[], int start, int end) {
        if (start >= end) {
            // Base case: If the range contains one or zero elements, it's considered sorted.
            return true;
        }

        int mid = start + (end - start) / 2;

        // Recursively check if the left and right halves are sorted.
        boolean leftSorted = isSortedArray(array, start, mid);
        boolean rightSorted = isSortedArray(array, mid + 1, end);

        // Check if the merge of the two sorted halves is also sorted.
        boolean mergedSorted = (array[mid] <= array[mid + 1]);

        // The entire range is sorted if both halves are sorted and the merge is sorted.
        return leftSorted && rightSorted && mergedSorted;
    }


}
