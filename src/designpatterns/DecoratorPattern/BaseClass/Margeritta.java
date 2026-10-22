package designpatterns.DecoratorPattern.BaseClass;

public class Margeritta extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return "Margeritta ";
    }


}
