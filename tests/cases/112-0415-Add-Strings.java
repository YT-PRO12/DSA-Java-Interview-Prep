class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("add strings");}
 public static void main(String[] args){
  check(AddStrings.addStrings("11","123").equals("134"));
  check(AddStrings.addStrings("456","77").equals("533"));
  check(AddStrings.addStrings("0","0").equals("0"));
  check(AddStrings.addStrings("999","1").equals("1000"));
  check(AddStrings.addStrings("999999999999999999","1").equals("1000000000000000000"));
 }
}