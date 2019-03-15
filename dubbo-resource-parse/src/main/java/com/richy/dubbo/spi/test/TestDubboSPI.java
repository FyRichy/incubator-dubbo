package com.richy.dubbo.spi.test;

import com.richy.dubbo.spi.interfaces.Roboty;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * 测试dubbo的SPI
 */
public class TestDubboSPI {

    public static void main(String[] args) {
        ExtensionLoader<Roboty> extensionLoader = ExtensionLoader.getExtensionLoader(Roboty.class);
        Roboty optimusPrime = extensionLoader.getExtension("bumbleBee");
        optimusPrime.sayHello();
    }
}
