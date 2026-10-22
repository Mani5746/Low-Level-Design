package designpatterns.DecoratorPattern;

import designpatterns.DecoratorPattern.BaseClass.BasePizza;
import designpatterns.DecoratorPattern.BaseClass.Margeritta;
import designpatterns.DecoratorPattern.DecoratorClass.ExtraCheese;
import designpatterns.DecoratorPattern.DecoratorClass.Mushroom;


public class Main {
    public static void main(String[] args){
        BasePizza pizza= new Mushroom(new ExtraCheese(new Margeritta()));

        System.out.println("Cost of "+ pizza.description()+" is "+pizza.cost());
    }

}
