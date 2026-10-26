import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.removeStars("leet**cod*e").equals("lecoe");
assert s.removeStars("erase*****").isEmpty();
assert s.removeStars("a".repeat(50000)+"*".repeat(50000)).isEmpty();
Random random=new Random(2390);
for(int trial=0;trial<1000;trial++){
 StringBuilder input=new StringBuilder();int balance=0;
 for(int i=0;i<80;i++){if(balance>0&&random.nextBoolean()){input.append('*');balance--;}else{input.append((char)('a'+random.nextInt(4)));balance++;}}
 String expected=input.toString();while(expected.contains("*"))expected=expected.replaceFirst("[a-z]\\*", "");
 assert s.removeStars(input.toString()).equals(expected);
}

 }
}
