package com.unfbx.设计模式.three_proxy.static_mode;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-05
 */
public class TeacherDaoProxy implements ITeacherDao {

    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("目标方法执行前");
        target.teach();
        System.out.println("目标方法执行后");

    }
}
