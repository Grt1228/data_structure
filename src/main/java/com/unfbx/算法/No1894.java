package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-10
 */
public class No1894 {

    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;
        System.out.println(chalkReplacer2(chalk,k));
    }

    //超时
    public static int chalkReplacer2(int[] chalk, int k) {
        long sum = 0;
        //单次总和
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        k%=sum;

        for (int i = 0; i < chalk.length; i++) {
            if (k >= chalk[i]) {
                k -= chalk[i];
            } else {
                return i;
            }
        }

        return -1;
    }
    //超时
    public static int chalkReplacer1(int[] chalk, int k) {
        while (k >= 0){
            for (int i = 0;i<chalk.length;i++){
                if(k >= chalk[i]){
                    k-=chalk[i];
                }else {
                    return i;
                }
            }
        }
        return -1;
    }
}
