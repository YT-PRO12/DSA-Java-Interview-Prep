import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s = new Solution();
assert s.nextGreatestLetter(new char[]{'c','f','j'}, 'c') == 'f';
assert s.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z') == 'x';
Random random = new Random(744);
for (int trial=0; trial<1000; trial++) {
 char[] a = new char[2+random.nextInt(50)];
 for(int i=0;i<a.length;i++) a[i]=(char)('a'+random.nextInt(26));
 a[0]='a';a[1]='z';Arrays.sort(a);
 char target=(char)('a'+random.nextInt(26)), expected=a[0];
 for(char c:a) if(c>target){expected=c;break;}
 assert s.nextGreatestLetter(a,target)==expected;
}

 }
}
