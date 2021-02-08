package com.unfbx.设计模式.three_proxy.d_mode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-05
 */
public class ProxyFactory {

    private Object target;

    /**
     * 构造器，初始化target
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk动态代理，开始了~~~");
                        //执行目标方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("jdk动态代理结束了");
                        return returnVal;
                    }
                });
    }
}
