package com.design.pattern.strategy.service;

/**
 * 商城促销业务层
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public interface MallService {

    /**
     * 根据商品单价和数量获取商品价格
     *
     * @param price    商品价格
     * @param num      商品数量
     * @param discount 折扣
     * @return 商品* 商品数量
     */
    double getGoodsPrice(double price, int num, double discount);
}
