import java.util.*;
class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("three sum");}
 public static void main(String[] args){
  List<List<Integer>> expected=Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1));
  check(ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4}).equals(expected));
  check(ThreeSum.threeSum(new int[]{0,0,0,0}).equals(Arrays.asList(Arrays.asList(0,0,0))));
  check(ThreeSum.threeSum(new int[]{1,2,-2,-1}).isEmpty());
  check(ThreeSum.threeSum(new int[]{}).isEmpty());
 }
}