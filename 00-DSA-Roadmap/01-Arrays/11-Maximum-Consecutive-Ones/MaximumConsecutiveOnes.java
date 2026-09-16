public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int maxCount = 0;

        for (int num : arr) {

            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};

        int answer = findMaxConsecutiveOnes(arr);

        System.out.println("Maximum consecutive ones: " + answer);
    }
}
