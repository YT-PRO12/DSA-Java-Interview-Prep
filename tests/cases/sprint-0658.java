import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.findClosestElements(new int[]{1,2,3,4,5},4,3).equals(Arrays.asList(1,2,3,4));
Random random=new Random(658);
for(int trial=0;trial<1000;trial++){
 int[] a=new int[1+random.nextInt(40)];for(int i=0;i<a.length;i++)a[i]=random.nextInt(61)-30;Arrays.sort(a);
 int k=1+random.nextInt(a.length),x=random.nextInt(101)-50;
 List<Integer> expected=new ArrayList<>();for(int value:a)expected.add(value);
 expected.sort(Comparator.<Integer>comparingLong(v->Math.abs((long)v-x)).thenComparingInt(v->v));
 expected=new ArrayList<>(expected.subList(0,k));Collections.sort(expected);
 assert s.findClosestElements(a,k,x).equals(expected);
}

 }
}
