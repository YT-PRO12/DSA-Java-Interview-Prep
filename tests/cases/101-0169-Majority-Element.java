class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("majority element");}
 public static void main(String[] args){
  check(MajorityElement.findMajorityElement(new int[]{2,2,1,1,1,2,2})==2);
  check(MajorityElement.findMajorityElement(new int[]{3,3,4})==3);
  check(MajorityElement.findMajorityElement(new int[]{9})==9);
  check(MajorityElement.findMajorityElement(new int[]{5,5,5,1,2})==5);
 }
}
