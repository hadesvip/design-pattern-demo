package com.design.pattern.strategy.factory;

import com.design.pattern.strategy.service.CashSuper;

/**
 * 正常收费
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashNormal implements CashSuper {

    @Override
    public double accpetCash(double money) {
        return money;
    }
}
