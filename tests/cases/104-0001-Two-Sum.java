import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("two sum");}
 public static void main(String[] args){
  check(Arrays.equals(TwoSum.findTwoSum(new int[]{2,7,11,15},9),new int[]{0,1}));
  check(Arrays.equals(TwoSum.findTwoSum(new int[]{3,3},6),new int[]{0,1}));
  check(Arrays.equals(TwoSum.findTwoSum(new int[]{-3,4,3,90},0),new int[]{0,2}));
  check(Arrays.equals(TwoSum.findTwoSum(new int[]{1,2,3},99),new int[]{-1,-1}));
 }
}
