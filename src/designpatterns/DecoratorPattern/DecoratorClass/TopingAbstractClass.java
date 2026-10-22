package designpatterns.DecoratorPattern.DecoratorClass;

import designpatterns.DecoratorPattern.BaseClass.BasePizza;

public abstract class TopingAbstractClass extends BasePizza {
   protected BasePizza basePizza;
    public TopingAbstractClass(BasePizza pizza){
        this.basePizza=pizza;
    }


}
