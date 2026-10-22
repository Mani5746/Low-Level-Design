package designpatterns.DecoratorPattern.DecoratorClass;

import designpatterns.DecoratorPattern.BaseClass.BasePizza;

public class Mushroom extends TopingAbstractClass{
    public Mushroom(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+70;
    }

    @Override
    public String description() {
        return this.basePizza.description()+" + Mushroom ";

    }

}
