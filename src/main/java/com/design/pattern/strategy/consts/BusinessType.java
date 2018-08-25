package com.design.pattern.strategy.consts;

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
    BUSINESS_REBATE(0, "折扣"),


    /**
     * 返利
     */
    BUSINESS_RETURN(1, "满减"),

    /**
     * 正常业务
     */
    BUSINESS_NORMAL(2, "正常业务");


    /**
     * 业务类型
     */
    private Integer type;

    /**
     * 业务描述
     */
    private String name;


    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    BusinessType(Integer type, String name) {
        this.type = type;
        this.name = name;
    }
}
