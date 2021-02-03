package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-03
 */
public class No58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Today is a nice day"));
    }

    public static int lengthOfLastWord(String s) {

        if("".equals(s) || " ".equals(s) || s == null){
            return 0;
        }
        s = s.trim();
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }

    public static int lengthOfLastWord1(String s) {

        if("".equals(s) || " ".equals(s) || s == null){
            return 0;
        }
        s = s.trim();
        int res = 0;
        for (int i = s.length()-1 ;i >= 0 ;i--){

            if(s.charAt(i) == ' '){
                break;
            }

            if(s.charAt(i) != ' '){
                res++;
            }

        }
        return res;
    }
}
