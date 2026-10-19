class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("atoi");}
 public static void main(String[] args){
  check(StringToIntegerAtoi.myAtoi("42")==42);
  check(StringToIntegerAtoi.myAtoi("   -42")==-42);
  check(StringToIntegerAtoi.myAtoi("4193 with words")==4193);
  check(StringToIntegerAtoi.myAtoi("words and 987")==0);
  check(StringToIntegerAtoi.myAtoi("-91283472332")==Integer.MIN_VALUE);
  check(StringToIntegerAtoi.myAtoi("91283472332")==Integer.MAX_VALUE);
  check(StringToIntegerAtoi.myAtoi("+")==0);
  check(StringToIntegerAtoi.myAtoi("  +0012x")==12);
 }
}
