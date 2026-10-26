import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.removeDuplicates("deeedbbcccbdaa",3).equals("aa");
assert s.removeDuplicates("pbbcggttciiippooaais",2).equals("ps");
assert s.removeDuplicates("a".repeat(100000),10000).isEmpty();
Random random=new Random(1209);
for(int trial=0;trial<1000;trial++){
 StringBuilder input=new StringBuilder();for(int i=0,n=1+random.nextInt(45);i<n;i++)input.append((char)('a'+random.nextInt(3)));
 int k=2+random.nextInt(5);String expected=input.toString();boolean changed=true;
 while(changed){changed=false;for(int i=0;i+k<=expected.length();i++){boolean same=true;for(int j=1;j<k;j++)same &= expected.charAt(i+j)==expected.charAt(i);if(same){expected=expected.substring(0,i)+expected.substring(i+k);changed=true;break;}}}
 assert s.removeDuplicates(input.toString(),k).equals(expected);
}

 }
}
