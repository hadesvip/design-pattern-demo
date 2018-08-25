package com.design.pattern.strategy;

import com.design.pattern.strategy.consts.DiscountConsts;
import com.design.pattern.strategy.factory.CashRebate;
import com.design.pattern.strategy.factory.CashSuper;

/**
 * 折扣子类
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashRebateFactory implements CashAbstractFactory {
    @Override
    public CashSuper createCashSuper() {
        return new CashRebate(DiscountConsts.DISCOUNT_8.getDiscount());
    }
}
