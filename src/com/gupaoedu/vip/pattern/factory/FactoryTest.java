package com.gupaoedu.vip.pattern.factory;

import sun.applet.Main;

/**
 * @author Administrator
 * @create 2018-03-07 15:54
 * @desc ${DESCRIPTION}
 **/
public class FactoryTest {

    public static void main(String[] args) {
        CondomFactory condomFactory = new CondomFactory();
        Condom okamoto = condomFactory.getOkamoto();
        System.out.println(okamoto.getName());
        System.out.println(okamoto.getSize());
    }
}
