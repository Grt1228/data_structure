package com.unfbx.算法;

/**
 * @Description 请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
 * <p>
 * 请你实现 ParkingSystem 类：
 * <p>
 * ParkingSystem(int big, int medium, int small) 初始化 ParkingSystem 类，三个参数分别对应每种停车位的数目。
 * bool addCar(int carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2 和 3 表示。一辆车只能停在  carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
 * [[1, 1, 0], [1], [2], [3], [1]]
 * 输出：
 * [null, true, true, false, false]
 * <p>
 * 解释：
 * ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
 * parkingSystem.addCar(1); // 返回 true ，因为有 1 个空的大车位
 * parkingSystem.addCar(2); // 返回 true ，因为有 1 个空的中车位
 * parkingSystem.addCar(3); // 返回 false ，因为没有空的小车位
 * parkingSystem.addCar(1); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-parking-system
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-01-13
 */
public class No1603 {
    private int big;
    private int medium;
    private int small;

    public static void main(String[] args) {
        No1603 parkingSystem = new No1603(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // 返回 true ，因为有 1 个空的大车位
        System.out.println(parkingSystem.addCar(2)); // 返回 true ，因为有 1 个空的中车位
        System.out.println(parkingSystem.addCar(3)); // 返回 false ，因为没有空的小车位
        System.out.println(parkingSystem.addCar(1)); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
    }

    public No1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean res = false;
        switch (carType) {
            case 1:
                this.big--;
                res = big >= 0;
                break;
            case 2:
                this.medium--;
                res = this.medium >= 0;
                break;
            case 3:
                this.small--;
                res = small >= 0;
                break;
        }

        return res;
    }
}
