package com.unfbx.设计模式.three_proxy.static_mode;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-05
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao.teach()");
    }
}
