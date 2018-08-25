package com.design.pattern.strategy.factory;

import com.design.pattern.strategy.service.CashSuper;

/**
 * 打折收费子类
 *
 * @author ${user}
 * @date ${date}
 */
public class CashRebate implements CashSuper {

    /**
     * 折扣
     */
    private double moneyRebate;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double accpetCash(double money) {
        return money * moneyRebate;
    }
}
