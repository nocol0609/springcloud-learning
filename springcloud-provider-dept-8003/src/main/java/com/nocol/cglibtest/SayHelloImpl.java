package com.nocol.cglibtest;

import com.nocol.jdktest.UserService;

/**
 * @author ：liuxp
 * @date ：Created in 2021/4/25 15:05
 * @description ：
 */
public class SayHelloImpl implements UserService {

    @Override
    public void say() {
        System.out.println("123123123123");
    }
}
