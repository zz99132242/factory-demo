package com.gupaoedu.vip.pattern.factory;

/**
 * @author Administrator
 * @create 2018-03-07 15:53
 * @desc ${DESCRIPTION}
 **/
public class CondomFactory extends AbstractFactory {
    @Override
    public Condom getDurex() {
        return new Durex();
    }

    @Override
    public Condom getJissbon() {
        return new Jissbon();
    }

    @Override
    public Condom getOkamoto() {
        return new Okamoto();
    }
}
