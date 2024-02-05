import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Colors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstArrayLength = sc.nextInt();
            int secondArrayLength = sc.nextInt();
            int queriesArrayLength = sc.nextInt();

            int[] firstArray = new int[firstArrayLength];
            int[] secondArray = new int[secondArrayLength];
            int[] queriesArray = new int[queriesArrayLength];

            Set<Integer> firstSet = new HashSet<>();

            for (int i = 0; i < firstArrayLength; i++) {
                int value = sc.nextInt();
                firstArray[i] = value;
                firstSet.add(value);
            }

            for (int j = 0; j < secondArrayLength; j++) {
                secondArray[j] = sc.nextInt();
            }

            for (int k = 0; k < queriesArrayLength; k++) {
                queriesArray[k] = sc.nextInt();
            }

            findMatchingPairs(firstSet, secondArray, queriesArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findMatchingPairs(Set<Integer> firstSet, int[] secondArray, int[] queriesArray) {
        for (int b : secondArray) {
            for (int query : queriesArray) {
                int a = query - b;
                if (firstSet.contains(a)) {
                    System.out.println(query + " => (" + a + "," + b + ")");
                }
            }
        }
    }
}
