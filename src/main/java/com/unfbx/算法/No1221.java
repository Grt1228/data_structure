package com.unfbx.算法;

/**
 * @Description 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "RL RRLL RL RL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RlLR", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 2：
 * <p>
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 3：
 * <p>
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 *  
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s[i] = 'L' 或 'R'
 * 分割得到的每个字符串都必须是平衡字符串。
 * @Author Grt
 * @Date 2020-12-22
 */
public class No1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        int res = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {

//            String temp = s.substring(startIndex, i + 2);
//            if ((temp.contains("L") && temp.contains("R"))
//                    && (temp.substring(0, temp.length() / 2)).equals(temp.substring(temp.length() / 2, temp.length()))) {
//                startIndex = i;
//                res+=1;
//            }

            if(s.charAt(i) == 'R'){
                num++;
            }
            if(s.charAt(i) == 'L'){
                num--;
            }

            if(num == 0){
                res++;
            }
        }


        return res;
    }
}
