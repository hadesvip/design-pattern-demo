package com.design.pattern.strategy;

import com.design.pattern.strategy.consts.BusinessType;
import com.design.pattern.strategy.consts.DiscountConsts;
import com.design.pattern.strategy.factory.CashNormal;
import com.design.pattern.strategy.factory.CashRebate;
import com.design.pattern.strategy.factory.CashReturn;
import com.design.pattern.strategy.factory.CashSuper;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 策略模式的核心
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashContext {

    /**
     * 算法定义接口
     */
    CashSuper cashSuper = null;

    /**
     * 抽象工厂
     */
    CashAbstractFactory cashAbstractFactory;


    /**
     * 初始化CashSuper
     *
     * @param businessType 用来获取生成对应CashSuper子类
     */
    public CashContext(BusinessType businessType) {

        try {
            /*使用反射+抽象工厂替换简单工厂中switch判断*/
            Class targetClass = businessType.getTargetClass();
            cashAbstractFactory = (CashAbstractFactory) targetClass.newInstance();
            cashSuper = cashAbstractFactory.createCashSuper();
        } catch (Exception e) {
            e.printStackTrace();
            //异常默认正常业务
            cashSuper = new CashNormal();
        }



        /*简单工厂缺点是if、else或者switch判断比较多*/
        //switch (businessType) {
        //    //正常收费
        //    case BUSINESS_NORMAL:
        //        cashSuper = new CashNormal();
        //        break;
        //
        //    // 满减
        //    case BUSINESS_RETURN:
        //        cashSuper = new CashReturn(300, 100);
        //        break;
        //
        //    //折扣
        //    case BUSINESS_REBATE:
        //        cashSuper = new CashRebate(DiscountConsts.DISCOUNT_8.getDiscount());
        //        break;
        //
        //    //默认正常业务
        //    default:
        //        cashSuper = new CashNormal();
        //}
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
