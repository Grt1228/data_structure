package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *  S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 * <p>
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 * @Author Grt
 * @Date 2020-12-29
 */
public class No771 {

    public static void main(String[] args) {
//        System.out.println('a' - 0);
        System.out.println('z' - 'A');

        System.out.println(numJewelsInStones2("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones2("z", "ZZ"));
    }

    /**
     * 效率搞很多，三倍左右
     * @param jewels
     * @param stones
     * @return
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[58];
        int temp = 0;
        for (int i = 0; i < jewels.length(); i++) {
            arr[jewels.charAt(i) - 'A'] = 1;
        }

        for (int j = 0; j < stones.length(); j++) {
            if (arr[stones.charAt(j) - 'A'] == 1) {
                temp += 1;
            }
        }
        return temp;
    }

    public static int numJewelsInStones2(String jewels, String stones) {
        Map<String,Integer> map = new HashMap<>();
        int temp = 0;
        String key = "";
        for (int i = 0; i < jewels.length(); i++) {
            key = String.valueOf(jewels.charAt(i));
            map.put(key,0);
        }

        for (int j = 0; j < stones.length(); j++) {
            key = String.valueOf(stones.charAt(j));
            if(map.get(key) != null){
                temp += 1;
            }
        }
        return temp;
    }
}
