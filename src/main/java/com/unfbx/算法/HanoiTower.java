package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2020-12-29
 */
public class HanoiTower {


    public static void main(String[] args) {
        hanoiTower(5,'A','B','C');
    }

    /**
     *
     * @param num   盘子的数目
     * @param a     源座
     * @param b     辅助座
     * @param c     目的座
     */
    public static void hanoiTower(int num,char a,char b,char c){


        //如果只有一个圆盘
        if(num == 1){
            System.out.println("第1个盘子从"+a+"->"+c);
        }else{
            //如果有n>=2的情况，我么总是可以看做是两个盘子，1、最下面的盘子。2、上面的所有盘子
            //1、先把最上面的盘子，A->B,然后过程会使用c
            hanoiTower(num-1,a,b,c);
            //2、把最下面的盘子，A->C
            System.out.println("第"+num+"个盘子从"+a+"->"+c);
            //3、把B塔的所有盘子从B->C，移动过程中用到a塔
            hanoiTower(num-1,b,a,c);
        }

    }
}
