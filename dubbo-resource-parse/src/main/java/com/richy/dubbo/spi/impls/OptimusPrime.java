package com.richy.dubbo.spi.impls;


import com.richy.dubbo.spi.interfaces.Roboty;

public class OptimusPrime implements Roboty {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.是Roboty的一个实现类");
    }
}
