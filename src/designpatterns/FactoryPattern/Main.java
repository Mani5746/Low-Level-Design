package designpatterns.FactoryPattern;

public class Main {
    public static void main(String[] args){
        GetShapeFactory shapeFactory= new GetShapeFactory();
        Shape shape= shapeFactory.getShape("Rectangle");
        shape.draw();

    }
}
