package com.nocol.jdktest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：liuxp
 * @date ：Created in 2021/4/25 14:09
 * @description ：
 */
public class UserServiceProxy implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK 监听开始..");
        Object invoke = method.invoke(target, args);
        System.out.println("JDK 监听结束..");
        return invoke;
    }

    /**
     * 获得代理对象
     * @return
     */
    private Object getUserServiceProxy(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        UserServiceProxy proxy=new UserServiceProxy();
        UserService userService=(UserService) proxy.getUserServiceProxy(new UserServiceImpl());
        userService.say();
    }

}
