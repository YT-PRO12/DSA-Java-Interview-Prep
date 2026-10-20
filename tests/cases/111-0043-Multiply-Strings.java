class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("multiply strings");}
 public static void main(String[] args){
  check(MultiplyStrings.multiply("123","456").equals("56088"));
  check(MultiplyStrings.multiply("0","99999").equals("0"));
  check(MultiplyStrings.multiply("99","99").equals("9801"));
  check(MultiplyStrings.multiply("1","7").equals("7"));
  check(MultiplyStrings.multiply("999","999").equals("998001"));
 }
}