package designpatterns.DecoratorPattern.BaseClass;

public class Farmhouse extends BasePizza{


    @Override
    public int cost() {
        return 300;
    }

    @Override
    public String description() {
        return "FarmHouse ";
    }


}
