import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();int[] counts={1,1,2,5,14,42,132,429,1430};
        for(int n=1;n<=8;n++){java.util.List<String> out=s.generateParenthesis(n);check(out.size()==counts[n] && new java.util.HashSet<>(out).size()==counts[n]);for(String word:out){int balance=0;check(word.length()==2*n);for(char c:word.toCharArray()){balance+=c=='('?1:-1;check(balance>=0);}check(balance==0);}}
    }
}
