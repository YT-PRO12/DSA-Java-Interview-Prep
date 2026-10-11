import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums,int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n:nums) freq.merge(n,1,Integer::sum);
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->Integer.compare(freq.get(a),freq.get(b)));
        for(int n:freq.keySet()) {
            heap.offer(n);
            if(heap.size()>k) heap.poll();
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++) result[i]=heap.poll();
        return result;
    }
}