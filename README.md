# design-pattern-demo
设计模式
1. 策略模式
    * 描述
        策略模式是定义了一系列算法的方法，所有的算法都是完成的相同的工作.只是实现的方法不同，以相同的方式调用所有的方法。 减少了算法之间的耦合。
        所有简单工厂+switch/if else 都可以使用抽象工厂+反射代替
    * 路径
        com.design.pattern.strategy
        
    * 阶段1：
         没有使用设计模式，只是使用了方法的封装，抽取常量
         ```
            DiscountConsts
            MallService
            MallServiceImpl
            Console
         
         ```
    
    * 阶段2：
        简单工厂模式
        ```
           CashSuper
           CashNormal
           CashRebate
           CashReturn
           CashFactory
           FactoryMain
        ```
    
    * 阶段3:
        策略模式+简单工厂
        ```
            CashSuper
            CashNormal
            CashRebate
            CashReturn
            CashContext
            StrategyMain
        ```
    
    * 阶段4:
        策略模式+抽象工厂+反射
        ```
            CashSuper
            BusinessType
            CashAbstractFactory
            CashNormalFactory
            CashRebateFactory
            CashReturnFactory  
            StrategyMain
        ```    
       
       
       
        