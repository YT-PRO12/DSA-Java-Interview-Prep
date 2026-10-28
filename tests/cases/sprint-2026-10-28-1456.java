import java.util.*;
class RegressionTest {
    public static void main(String[] args) {
Solution solution=new Solution();
assert solution.maxVowels("abciiidef",3)==3;
assert solution.maxVowels("rhythms",3)==0;
assert solution.maxVowels("aeiou",5)==5;
Random random=new Random(1456);String alphabet="aeioubcdfgh";
for(int trial=0;trial<1000;trial++){
 StringBuilder text=new StringBuilder();int n=1+random.nextInt(30);for(int i=0;i<n;i++)text.append(alphabet.charAt(random.nextInt(alphabet.length())));
 String s=text.toString();int k=1+random.nextInt(n),expected=0;
 for(int left=0;left+k<=n;left++){int count=0;for(int i=left;i<left+k;i++)if("aeiou".indexOf(s.charAt(i))>=0)count++;expected=Math.max(expected,count);}
 assert solution.maxVowels(s,k)==expected;
}
assert solution.maxVowels("b".repeat(99999)+"a",50000)==1;
assert solution.maxVowels("a".repeat(100000),100000)==100000;
    }
}
