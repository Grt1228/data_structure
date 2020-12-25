package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 *
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。
 * Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。
 * 然后，按原顺序将经解释得到的字符串连接成一个字符串。
 *
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 *
 * 示例 1：
 *
 * 输入：command = "G()(al)"
 * 输出："Goal"
 * 解释：Goal 解析器解释命令的步骤如下所示：
 * G -> G
 * () -> o
 * (al) -> al
 * 最后连接得到的结果是 "Goal"
 * 示例 2：
 *
 * 输入：command = "G()()()()(al)"
 * 输出："Gooooal"
 * 示例 3：
 *
 * 输入：command = "(al)G(al)()()G"
 * 输出："alGalooG"
 *  
 * 提示：
 *
 * 1 <= command.length <= 100
 * command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成
 *
 * @Author Grt
 * @Date 2020-12-25
 */
public class No1678 {
    public static void main(String[] args) {
        System.out.println(interpret2("(al)G(al)()()G"));
        System.out.println(interpret2("G()()()()(al)"));
        System.out.println(interpret2("G()(al)"));
    }
    public static String interpret(String command) {
        if(command == null || command.equals("")){
            return null;
        }

        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }

    public static String interpret2(String command) {
        if(command == null || command.equals("")){
            return null;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length() - 1; i++) {

            if(command.charAt(i) == 'G'){
                res.append("G");
                continue;
            }

            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                res.append("o");
                i++;
            }

            if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                res.append("al");
                i+=3;
            }

        }
        return res.toString();
    }
}
