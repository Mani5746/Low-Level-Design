package designpatterns.DecoratorPattern.DecoratorClass;

import designpatterns.DecoratorPattern.BaseClass.BasePizza;

public class ExtraCheese extends TopingAbstractClass{

    public ExtraCheese(BasePizza pizza){
       super(pizza);
    }
    @Override
    public int cost() {
       return this.basePizza.cost()+50;
    }

    @Override
    public String description() {
        return this.basePizza.description()+" + Extra Cheese ";
    }


}
