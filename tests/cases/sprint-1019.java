import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
Random random=new Random(1019);
for(int trial=0;trial<1000;trial++){
 int[] a=trial==0?new int[]{2,1,5}:new int[1+random.nextInt(50)];
 if(trial>0)for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(15);
 ListNode head=null;for(int i=a.length-1;i>=0;i--){ListNode node=new ListNode(a[i]);node.next=head;head=node;}
 int[] expected=new int[a.length];for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[j]>a[i]){expected[i]=a[j];break;}
 assert Arrays.equals(s.nextLargerNodes(head),expected);
 ListNode node=head;for(int value:a){assert node.val==value;node=node.next;}assert node==null;
}

 }
}
