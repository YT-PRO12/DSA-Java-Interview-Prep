import java.util.*;

public class IntersectionOfTwoArrays {

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new LinkedHashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return new ArrayList<>(intersection);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> result = findIntersection(arr1, arr2);

        System.out.println("Intersection of arrays: " + result);
    }
}
