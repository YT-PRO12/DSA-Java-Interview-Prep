import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.removeDuplicates("abbaca").equals("ca");
assert s.removeDuplicates("azxxzy").equals("ay");
assert s.removeDuplicates("a".repeat(100000)).isEmpty();
Random random=new Random(1047);
for(int trial=0;trial<1000;trial++){
 StringBuilder input=new StringBuilder();for(int i=0,n=1+random.nextInt(40);i<n;i++)input.append((char)('a'+random.nextInt(4)));
 String expected=input.toString();boolean changed=true;
 while(changed){changed=false;for(int i=1;i<expected.length();i++)if(expected.charAt(i)==expected.charAt(i-1)){expected=expected.substring(0,i-1)+expected.substring(i+1);changed=true;break;}}
 assert s.removeDuplicates(input.toString()).equals(expected);
}

 }
}
