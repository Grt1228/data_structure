package com.unfbx.设计模式.three_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-07
 */
public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;
    //构造器传入目标对象
    public ProxyFactory(Object target){
        this.target = target;
    }

    //返回一个代理对象： 是target对象的代理对象
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib end");
        return invoke;
    }
}
