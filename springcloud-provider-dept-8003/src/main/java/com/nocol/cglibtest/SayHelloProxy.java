package com.nocol.cglibtest;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：liuxp
 * @date ：Created in 2021/4/25 14:55
 * @description ：
 */
public class SayHelloProxy implements MethodInterceptor {

    private Enhancer enhancer=new Enhancer();

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 监听开始...");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB 监听结束...");
        return invokeSuper;
    }

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        SayHelloProxy proxy=new SayHelloProxy();
        //代理普通类
        //SayHelloImpl sayHello = (SayHelloImpl) proxy.getProxy(SayHelloImpl.class);

        //代理实现了接口的类
        SayHello sayHello = (SayHello) proxy.getProxy(SayHello.class);
        sayHello.say();
    }

}
