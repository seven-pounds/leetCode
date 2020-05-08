package LeetCode.LookTable4;





import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

public class Num149 {
    public static void main(String[] args) {
        int[][] a={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[] b={2,2};
        System.out.println((int)Math.ceil(Math.sqrt(3*2)));
//        System.out.println(maxPoints(a));
    }
    public static int maxPoints(int[][] points) {
        Map<Double,Integer> map=new HashMap<>();
        if(points[0].length<=1) return points[0].length;
        for (int i = 0; i < points.length-1; i++) {
            for (int j = i+1; j < points.length; j++) {
                double k=xielu(points[i],points[j]);
                if(map.containsKey(k)){
                    map.put(k,map.get(k)+1);
                }else{
                    map.put(k,1);
                }
            }
        }
        int ans=0;
        for (Integer i:map.values()) {
            ans=Math.max(ans,i);
        }

        return (int)Math.ceil(Math.sqrt(ans*2));
    }
    public static double xielu(int[] a,int[] b){
        if(b[0]-a[0]==0) return Double.MAX_VALUE;
        return (double) (b[1]-a[1])/(double) (b[0]-a[0]);
    }
}
