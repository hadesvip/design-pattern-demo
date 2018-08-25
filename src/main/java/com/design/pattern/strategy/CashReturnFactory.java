package com.design.pattern.strategy;

import com.design.pattern.strategy.factory.CashReturn;
import com.design.pattern.strategy.service.CashSuper;
import com.design.pattern.strategy.service.CashAbstractFactory;

/**
 * 满减子类
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashReturnFactory implements CashAbstractFactory {
    @Override
    public CashSuper createCashSuper() {
        return new CashReturn(300, 100);
    }
}
