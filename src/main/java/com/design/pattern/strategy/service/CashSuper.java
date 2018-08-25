package com.design.pattern.strategy.service;

/**
 * 现金收费抽象
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public interface CashSuper {

    /**
     * 返回实际的价格
     *
     * @param money 原价
     * @return 返回打折的价格
     */
    double accpetCash(double money);
}
