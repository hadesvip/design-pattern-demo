package com.design.pattern.strategy.consts;

/**
 * 折扣常量类
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public enum DiscountConsts {

    /**
     * 五折
     */
    DISCOUNT_5("八折", "0.5"),

    /**
     * 七折
     */
    DISCOUNT_7("八折", "0.7"),

    /**
     * 八折
     */
    DISCOUNT_8("八折", "0.8"),

    /**
     * 正常收费
     */
    DISCOUNT_0("正常收费", "1");


    /**
     * 标题
     */
    private String title;

    /**
     * 折扣
     */
    private String discount;


    public String getTitle() {
        return title;
    }

    public String getDiscount() {
        return discount;
    }

    DiscountConsts(String title, String discount) {
        this.title = title;
        this.discount = discount;
    }
}
