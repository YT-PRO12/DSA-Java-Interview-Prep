// LeetCode 200: NumberOfIslands
// Standalone Java solution and regression checks.
// Run: javac NumberOfIslands.java && java NumberOfIslands

import java.util.*;
class NumberOfIslands {
 static int solve(char[][] g) {
  if(g.length==0)return 0;
  int n=g.length,m=g[0].length,count=0;
  boolean[][] seen=new boolean[n][m];
  int[] dr={-1,1,0,0},dc={0,0,-1,1};
  ArrayDeque<int[]> q=new ArrayDeque<>();
  for(int r=0;r<n;r++) for(int c=0;c<m;c++){
   if(g[r][c]!='1'||seen[r][c])continue;
   count++;seen[r][c]=true;q.add(new int[]{r,c});
   while(!q.isEmpty()){
    int[] p=q.remove();
    for(int d=0;d<4;d++){
     int x=p[0]+dr[d],y=p[1]+dc[d];
     if(x>=0&&x<n&&y>=0&&y<m&&g[x][y]=='1'&&!seen[x][y]){
      seen[x][y]=true;q.add(new int[]{x,y});
     }
    }
   }
  }
  return count;
 }
 public static void main(String[] args){
  char[][] g={{'1','1','0'},{'0','1','0'},{'1','0','1'}};
  if(solve(g)!=3||solve(g)!=3||solve(new char[0][0])!=0)throw new AssertionError();
  System.out.println("PASS");
 }
}
