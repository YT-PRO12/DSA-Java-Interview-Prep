import java.util.*;

public class UnionOfTwoArrays {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        List<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of arrays: " + union);
    }
}
