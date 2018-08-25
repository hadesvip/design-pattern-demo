package com.design.pattern.strategy;


import com.design.pattern.strategy.factory.CashNormal;
import com.design.pattern.strategy.service.CashSuper;
import com.design.pattern.strategy.service.CashAbstractFactory;

/**
 * 正常业务
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashNormalFactory implements CashAbstractFactory {
    @Override
    public CashSuper createCashSuper() {
        return new CashNormal();
    }
}
