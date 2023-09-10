import java.util.Scanner;

public class Solution {
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
            System.out.println(minimumOperationsToUnsort_V2(size,t));
        }
    }

    public static long minimumOperationsToUnsort_V2(int size,long[] array){
        if(!isSortedArray(array,0,size-1))
            return 0;

        long min_diff=99999; // +linfini
        for(int i=1;i<size;i++){
            long lastItem=array[i-1];
            long currentItem=array[i];
            long k=(currentItem-lastItem)/2+1;
            min_diff=Math.min(k,min_diff);
        }
        return min_diff;
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
