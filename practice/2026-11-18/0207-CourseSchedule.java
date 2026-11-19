// LeetCode 207: CourseSchedule
// Standalone Java solution and regression checks.
// Run: javac CourseSchedule.java && java CourseSchedule

import java.util.*;
class CourseSchedule {
 static boolean solve(int n,int[][] prerequisites){
  List<List<Integer>> adj=new ArrayList<>();
  for(int i=0;i<n;i++)adj.add(new ArrayList<>());
  int[] indegree=new int[n];
  for(int[] p:prerequisites){adj.get(p[1]).add(p[0]);indegree[p[0]]++;}
  Queue<Integer> q=new ArrayDeque<>();
  for(int i=0;i<n;i++)if(indegree[i]==0)q.add(i);
  int done=0;
  while(!q.isEmpty()){
   int v=q.remove();done++;
   for(int w:adj.get(v))if(--indegree[w]==0)q.add(w);
  }
  return done==n;
 }
 public static void main(String[] args){
  if(!solve(2,new int[][]{{1,0}})||solve(2,new int[][]{{1,0},{0,1}})
   ||!solve(1,new int[0][0]))throw new AssertionError();
  System.out.println("PASS");
 }
}
