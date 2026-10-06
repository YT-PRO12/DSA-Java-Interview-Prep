public class StringCompression {

    public static int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char current = chars[read];
            int start = read;

            while (read < chars.length && chars[read] == current) {
                read++;
            }

            int count = read - start;

            chars[write++] = current;

            if (count > 1) {

                String number = String.valueOf(count);

                for (char digit : number.toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int length = compress(chars);

        System.out.print("Compressed string: ");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
        System.out.println("New length: " + length);
    }
}
