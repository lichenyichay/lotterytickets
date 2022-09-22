import java.util.Random;

import static java.lang.System.*;

public class lotterytickets {
    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        int[] data = new int[7];
        int foot = 0;
        while(foot<7){
            int t = rand.nextInt(41);
            if (!isRepeat(data,t)) {
                data[foot++] = t;
            }
        }
        java.util.Arrays.sort(data);
        for (int datum : data) {
            out.println(datum);
        }
    }

    /**
     * 此方法主要判断是否存在重复的内容，但不允许保存0
     * @param temp 指已经保存的数据
     * @param num 新生成的数据
     * @return 如果存在返回true，否则返回false
     */
    private static boolean isRepeat(int[] temp, int num) {
        if(num==0) return true;
        for (int i : temp) if (i == num) return true;
        return false;
    }
}

