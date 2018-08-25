package com.design.pattern.strategy.main;

import com.design.pattern.strategy.consts.BusinessType;
import com.design.pattern.strategy.factory.CashFactory;
import com.design.pattern.strategy.factory.CashSuper;

/**
 * 工厂实现
 * <p>
 * 业务场景:一个商城对商品进行打折、满减、正常业务
 * 缺点:对于算法经常修改的，经常需要修改工厂方法实现，耦合性还是很高
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class FactoryMain {

    public static void main(String[] args) {

        //正常业务实现
        CashSuper cashSuper = null;
        double money = 0;
        cashSuper = CashFactory.getCashAccept(BusinessType.BUSINESS_NORMAL);
        money = cashSuper.accpetCash(200);
        System.out.println(money);

        //满减业务
        cashSuper = CashFactory.getCashAccept(BusinessType.BUSINESS_REBATE);
        money = cashSuper.accpetCash(200);
        System.out.println(money);
    }
}
