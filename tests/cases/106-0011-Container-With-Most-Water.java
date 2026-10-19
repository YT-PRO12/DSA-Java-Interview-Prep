class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("container area");}
 public static void main(String[] args){
  check(ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7})==49);
  check(ContainerWithMostWater.maxArea(new int[]{1,1})==1);
  check(ContainerWithMostWater.maxArea(new int[]{4,3,2,1,4})==16);
  check(ContainerWithMostWater.maxArea(new int[]{1,2,1})==2);
 }
}
