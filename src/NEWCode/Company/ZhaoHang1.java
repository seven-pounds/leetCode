package NEWCode.Company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZhaoHang1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        //分别统计C在前面和D在前面的移动次数
        int retC = 0, retD = 0, count_C = 0, count_D = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'C') {
                retC += i - count_C;
                count_C++;//记录出现前面出现多少个 'C',从第i个位置把C移动到底count_c个位置需要移动 i - count_c次
            } else {
                retD += i - count_D;
                count_D++;//记录出现前面出现多少个 'D'
            }
        }
        System.out.println(Math.min(retC, retD));
    }
}
