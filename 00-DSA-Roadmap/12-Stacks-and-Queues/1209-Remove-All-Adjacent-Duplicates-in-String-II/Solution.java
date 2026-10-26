class Solution {
    public String removeDuplicates(String s, int k) {
        char[] stack = new char[s.length()];
        int[] counts = new int[s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            stack[size] = current;
            counts[size] = size > 0 && stack[size - 1] == current ? counts[size - 1] + 1 : 1;
            size++;
            if (counts[size - 1] == k) size -= k;
        }
        return new String(stack, 0, size);
    }
}
