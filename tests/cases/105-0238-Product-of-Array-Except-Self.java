import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("product except self");}
 public static void main(String[] args){
  check(Arrays.equals(ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4}),new int[]{24,12,8,6}));
  check(Arrays.equals(ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,0,4}),new int[]{0,0,8,0}));
  check(Arrays.equals(ProductOfArrayExceptSelf.productExceptSelf(new int[]{0,2,0}),new int[]{0,0,0}));
  check(Arrays.equals(ProductOfArrayExceptSelf.productExceptSelf(new int[]{5}),new int[]{1}));
 }
}
