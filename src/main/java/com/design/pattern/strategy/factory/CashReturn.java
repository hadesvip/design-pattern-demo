package com.design.pattern.strategy.factory;

import com.design.pattern.strategy.service.CashSuper;

/**
 * 返利收费
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashReturn implements CashSuper {

    private double moneyCondition;

    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double accpetCash(double money) {

        double result = money;
        if (money > moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
