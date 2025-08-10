package abstractDesignPattern;

public class FactoryDesignPatternMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get circle obj
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("rectangle");

        rectangle.draw();
        circle.draw();
    }
}
