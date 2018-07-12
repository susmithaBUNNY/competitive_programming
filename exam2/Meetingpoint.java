import java.util.*;
public class Meetingpoint{
    public  static  void  distance(int[][] g){
        int m=g.length;
        int n=g[0].length;
        ArrayList<Integer> col = new ArrayList<Integer>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==1){
                    col.add(j);
                    row.add(i);
                }
            }
        }
        int s=0;
        for(Integer i: row)
            s = s+Math.abs(i-row.get(row.size()/2));
        Collections.sort(col);
        for(Integer i: col)
            s = s+Math.abs(i-col.get(col.size()/2));
        System.out.println(s);
    }
    public static void main(String[] args){
        int [][] a1= {{1, 0, 0, 0, 1},{0, 0, 0, 0, 0},{0, 0, 1, 0, 0}};
        distance(a1);
        int [][] a2= {{1, 0, 1, 0, 1},{0, 1, 0, 0, 0},{0, 1, 1, 0, 0}};
        distance(a2);
        int [][] a3=  {{1, 1},{1,1}};
        distance(a3);
        int [][] a4= {{0, 0},{0, 0}};
        distance(a4);
        int [][] a5=  {{1, 0},{0, 0}};
        distance(a5);

    }
}
