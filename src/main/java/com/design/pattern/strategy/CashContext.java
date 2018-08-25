package com.design.pattern.strategy;

import com.design.pattern.strategy.consts.BusinessType;
import com.design.pattern.strategy.consts.DiscountConsts;
import com.design.pattern.strategy.factory.CashNormal;
import com.design.pattern.strategy.factory.CashRebate;
import com.design.pattern.strategy.factory.CashReturn;
import com.design.pattern.strategy.factory.CashSuper;

/**
 * 策略模式的核心
 *
 * @author wangyong
 * @date ${date}
 */
public class CashContext {

    /**
     * 算法定义接口
     */
    CashSuper cashSuper = null;


    /**
     * 初始化CashSuper
     *
     * @param businessType 用来获取生成对应CashSuper子类
     */
    public CashContext(BusinessType businessType) {


        switch (businessType) {
            //正常收费
            case BUSINESS_NORMAL:
                cashSuper = new CashNormal();
                break;

            // 满减
            case BUSINESS_RETURN:
                cashSuper = new CashReturn(300, 100);
                break;

            //折扣
            case BUSINESS_REBATE:
                cashSuper = new CashRebate(DiscountConsts.DISCOUNT_8.getDiscount());
                break;

            //默认正常业务
            default:
                cashSuper = new CashNormal();
        }
    }


    /**
     * 获取对应算法计算的结果
     *
     * @param money 原始价格
     * @return 实际价格
     */
    public double getResult(double money) {
        return cashSuper.accpetCash(money);
    }
}
