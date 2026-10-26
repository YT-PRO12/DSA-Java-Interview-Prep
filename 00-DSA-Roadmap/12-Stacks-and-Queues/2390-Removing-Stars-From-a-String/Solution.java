class Solution {
    public String removeStars(String s) {
        char[] result = new char[s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '*') size--;
            else result[size++] = current;
        }
        return new String(result, 0, size);
    }
}
