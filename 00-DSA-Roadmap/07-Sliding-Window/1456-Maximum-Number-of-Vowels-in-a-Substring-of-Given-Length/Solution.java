class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) count++;
            if (right >= k && isVowel(s.charAt(right - k))) count--;
            if (right >= k - 1) best = Math.max(best, count);
        }
        return best;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
