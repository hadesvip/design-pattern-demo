package com.design.pattern.strategy;

import com.design.pattern.strategy.consts.BusinessType;
import com.design.pattern.strategy.consts.DiscountConsts;
import com.design.pattern.strategy.service.MallService;
import com.design.pattern.strategy.service.impl.MallServiceImpl;

import static com.design.pattern.strategy.consts.DiscountConsts.*;

/**
 * 策略模式运行入口
 *
 * @author wangyong
 * @date 2018年08月25日
 */
public class StrategyMain {


    public static void main(String[] args) {
        //double total = 0;
        //DiscountConsts discountConsts = DiscountConsts.DISCOUNT_7;
        //MallService mallService = new MallServiceImpl();
        //
        //switch (discountConsts) {
        //    case DISCOUNT_5:
        //        total = mallService.getGoodsPrice(5, 6, DISCOUNT_5.getDiscount());
        //        break;
        //    case DISCOUNT_0:
        //        total = mallService.getGoodsPrice(5, 6, DISCOUNT_0.getDiscount());
        //        break;
        //    case DISCOUNT_7:
        //        total = mallService.getGoodsPrice(5, 6, DISCOUNT_7.getDiscount());
        //        break;
        //    case DISCOUNT_8:
        //        total = mallService.getGoodsPrice(5, 6, DISCOUNT_8.getDiscount());
        //        break;
        //    default:
        //
        //}
        //
        //System.out.println("价格：" + total);


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
