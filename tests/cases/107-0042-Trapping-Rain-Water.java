class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("trapping rain water");}
 public static void main(String[] args){
  check(TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})==6);
  check(TrappingRainWater.trap(new int[]{4,2,0,3,2,5})==9);
  check(TrappingRainWater.trap(new int[]{1,2,3,4})==0);
  check(TrappingRainWater.trap(new int[]{3,3,3})==0);
  check(TrappingRainWater.trap(new int[]{2,0,2})==2);
 }
}
