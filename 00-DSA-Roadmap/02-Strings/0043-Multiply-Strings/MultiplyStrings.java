public class MultiplyStrings {

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int multiplication =
                        (num1.charAt(i) - '0') *
                        (num2.charAt(j) - '0');

                int sum = multiplication + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        int index = 0;

        while (index < result.length && result[index] == 0) {
            index++;
        }

        while (index < result.length) {
            answer.append(result[index++]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";

        System.out.println("Product: " + multiply(num1, num2));
    }
}
