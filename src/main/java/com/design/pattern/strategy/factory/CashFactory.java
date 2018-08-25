package com.design.pattern.strategy.factory;

import com.design.pattern.strategy.consts.BusinessType;

/**
 * 工厂
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class CashFactory {

    /**
     * cashsuper工厂
     *
     * @param type 业务类型
     * @return 返回 CashSuper
     */
    public static CashSuper getCashAccept(BusinessType type) {

        CashSuper cashSuper = null;
        switch (type) {
            case BUSINESS_NORMAL:
                cashSuper = new CashNormal();
                break;

            case BUSINESS_RETURN:
                cashSuper = new CashReturn(300, 100);
                break;
            case BUSINESS_REBATE:
                cashSuper = new CashRebate("0.8");
                break;
            default:
        }
        return cashSuper;
    }


}
