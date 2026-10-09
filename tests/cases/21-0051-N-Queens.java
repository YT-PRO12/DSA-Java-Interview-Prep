import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();int[] expected={0,1,0,0,2,10,4,40,92};
        for(int n=1;n<=8;n++){java.util.List<java.util.List<String>> out=s.solveNQueens(n);check(out.size()==expected[n] && new java.util.HashSet<>(out).size()==out.size());for(java.util.List<String> board:out){java.util.Set<Integer> cols=new java.util.HashSet<>(),up=new java.util.HashSet<>(),down=new java.util.HashSet<>();for(int row=0;row<n;row++){String line=board.get(row);int c=line.indexOf('Q');check(c>=0 && line.lastIndexOf('Q')==c && cols.add(c)&&up.add(row+c)&&down.add(row-c));}}}
    }
}
