package com.design.pattern.strategy.main;

import com.design.pattern.strategy.consts.DiscountConsts;
import com.design.pattern.strategy.service.MallService;
import com.design.pattern.strategy.service.impl.MallServiceImpl;

import static com.design.pattern.strategy.consts.DiscountConsts.*;

/**
 * 业务场景:一个商城对商品进行打折、满减、正常业务
 *
 * 没有设计模式的实现，只是简单的方法抽取和常量抽取
 * 缺点：好多代码耦合在客户端，重复代码比较多
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class Cosole {

    public static void main(String[] args) {
        double total = 0;
        DiscountConsts discountConsts = DISCOUNT_7;
        MallService mallService = new MallServiceImpl();

        switch (discountConsts) {
            case DISCOUNT_5:
                total = mallService.getGoodsPrice(5, 6, DISCOUNT_5.getDiscount());
                break;
            case DISCOUNT_0:
                total = mallService.getGoodsPrice(5, 6, DISCOUNT_0.getDiscount());
                break;
            case DISCOUNT_7:
                total = mallService.getGoodsPrice(5, 6, DISCOUNT_7.getDiscount());
                break;
            case DISCOUNT_8:
                total = mallService.getGoodsPrice(5, 6, DISCOUNT_8.getDiscount());
                break;
            default:
        }
        System.out.println("价格：" + total);

    }
}
