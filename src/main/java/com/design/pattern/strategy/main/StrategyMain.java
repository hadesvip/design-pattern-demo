package com.design.pattern.strategy.main;

import com.design.pattern.strategy.CashContext;
import com.design.pattern.strategy.consts.BusinessType;

/**
 * 策略模式运行入口
 * <p>
 * 业务场景:一个商城对商品进行打折、满减、正常业务
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class StrategyMain {


    public static void main(String[] args) {

        //正常业务
        CashContext cashContext = new CashContext(BusinessType.BUSINESS_NORMAL);
        double result = cashContext.getResult(200);
        System.out.println(result);

        //满减
        cashContext = new CashContext(BusinessType.BUSINESS_REBATE);
        result = cashContext.getResult(200);
        System.out.println(result);

    }
}
