package LeetCode.Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Num51 {
    List<List<String>> res= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<String> list =new ArrayList<>();
        int[] col =new int[n];
        Set d1 = new HashSet();
        Set d2 = new HashSet();
        backtrack(list,n,0,col,d1,d2);
        return res;
    }
    public void backtrack(List<String> list,int n,int row,int[] col ,Set d1,Set d2){
        if(row==n){
//            list.add(str);
            res.add(list);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(col[i]==1) continue;
            int v1 = row-i;
            if(d1.contains(v1)) continue;
            int v2 = row+i;
            if(d2.contains(v2)) continue;
            String s=generateString(i,n);
            list.add(s);
            col[i]=1;
            d1.add(row-i);
            d2.add(row+i);
            backtrack(list,n,row+1,col,d1,d2);
            col[i]=0;
            d1.remove(row-i);
            d2.remove(row+i);
            list.remove(list.size()-1);
        }
    }

    private String generateString(int k,int n) {
        String str="";
        for (int i = 0; i < n; i++) {
            if(i==k) {
                str=str+'Q';
            }else{
                str=str+'.';
            }
        }
        return str;
    }
}
