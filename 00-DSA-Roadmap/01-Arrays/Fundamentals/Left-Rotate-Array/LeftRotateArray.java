public class LeftRotateArray {

    public static void leftRotate(int[] arr) {

        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        leftRotate(arr);

        System.out.print("Array after left rotation: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
