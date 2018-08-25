package com.design.pattern.strategy.factory;

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
     * @param type
     * @return
     */
    public static CashSuper getCashAccept(String type) {

        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;

            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            default:
        }
        return cashSuper;
    }


}
