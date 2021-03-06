package com.design.pattern.strategy.service;

/**
 * 抽象工厂
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public interface CashAbstractFactory {

    /**
     * 创建CashSuper
     *
     * @return 返回CashSuper实例
     */
    CashSuper createCashSuper();
}
