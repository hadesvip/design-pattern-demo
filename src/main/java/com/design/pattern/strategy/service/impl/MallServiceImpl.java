package com.design.pattern.strategy.service.impl;

import com.design.pattern.strategy.service.MallService;

/**
 * 商品促销业务实现
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class MallServiceImpl implements MallService {

    /**
     * @param price 商品价格
     * @param num   商品数量
     */
    @Override
    public double getGoodsPrice(double price, int num, double discount) {
        return price * num * discount;
    }
}
