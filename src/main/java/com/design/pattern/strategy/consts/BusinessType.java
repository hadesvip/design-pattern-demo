package com.design.pattern.strategy.consts;

import com.design.pattern.strategy.CashNormalFactory;
import com.design.pattern.strategy.CashRebateFactory;
import com.design.pattern.strategy.CashReturnFactory;
import com.design.pattern.strategy.factory.CashNormal;
import com.design.pattern.strategy.factory.CashRebate;

/**
 * 业务类型常量
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public enum BusinessType {


    /**
     * 打折
     */
    BUSINESS_REBATE(0, "折扣", CashRebateFactory.class),


    /**
     * 满减
     */
    BUSINESS_RETURN(1, "满减", CashReturnFactory.class),

    /**
     * 正常业务
     */
    BUSINESS_NORMAL(2, "正常业务", CashNormalFactory.class);


    /**
     * 业务类型
     */
    private Integer type;

    /**
     * 业务描述
     */
    private String name;


    /**
     * 对应的实现类
     */
    private Class targetClass;

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }


    public Class getTargetClass() {
        return targetClass;
    }

    BusinessType(Integer type, String name, Class targetClass) {
        this.type = type;
        this.name = name;
        this.targetClass = targetClass;
    }
}
