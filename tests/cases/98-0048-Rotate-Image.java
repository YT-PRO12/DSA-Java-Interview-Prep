import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("rotate image");}
 static void eq(int[][] a,int[][] b){check(Arrays.deepEquals(a,b));}
 public static void main(String[] args){
  int[][] one={{7}};RotateMatrix.rotate(one);eq(one,new int[][]{{7}});
  int[][] two={{1,2},{3,4}};RotateMatrix.rotate(two);eq(two,new int[][]{{3,1},{4,2}});
  int[][] three={{1,2,3},{4,5,6},{7,8,9}};RotateMatrix.rotate(three);
  eq(three,new int[][]{{7,4,1},{8,5,2},{9,6,3}});
 }
}
