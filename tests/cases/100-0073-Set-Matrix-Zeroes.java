import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("set matrix zeroes");}
 static void eq(int[][] a,int[][] b){check(Arrays.deepEquals(a,b));}
 public static void main(String[] args){
  int[][] a={{1,1,1},{1,0,1},{1,1,1}};SetMatrixZeroes.setZeroes(a);eq(a,new int[][]{{1,0,1},{0,0,0},{1,0,1}});
  int[][] b={{0,1,2,0},{3,4,5,2},{1,3,1,5}};SetMatrixZeroes.setZeroes(b);eq(b,new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}});
  int[][] c={{1,2},{3,4}};SetMatrixZeroes.setZeroes(c);eq(c,new int[][]{{1,2},{3,4}});
 }
}
