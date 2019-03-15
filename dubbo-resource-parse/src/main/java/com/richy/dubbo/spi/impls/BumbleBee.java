package com.richy.dubbo.spi.impls;


import com.richy.dubbo.spi.interfaces.Roboty;

/**
 * 定义另外一个实现类
 */
public class BumbleBee implements Roboty {


    @Override
    public void sayHello() {
        System.out.println("Hello EveryBody,I'm BumbleBean.....");
    }
}
