import java.util.*;
class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("majority element II");}
 public static void main(String[] args){
  check(MajorityElementII.findMajorityElements(new int[]{3,2,3}).equals(Arrays.asList(3)));
  check(MajorityElementII.findMajorityElements(new int[]{1,2,3,1,2,1,1}).equals(Arrays.asList(1)));
  check(MajorityElementII.findMajorityElements(new int[]{1,2,3,4}).isEmpty());
  check(MajorityElementII.findMajorityElements(new int[]{1,1,1,2,2,2,3,3}).equals(Arrays.asList(1,2)));
  check(MajorityElementII.findMajorityElements(new int[]{}).isEmpty());
 }
}