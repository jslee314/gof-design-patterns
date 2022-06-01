

import shape.Circle;
import shape.Rectangle;
import shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapes2 = new ArrayList<>();

        // 0 원
        // 1 원-클론
        // 2 네모
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";


        Circle anotherCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";



//        shapes.add(circle);
//        shapes.add(anotherCircle);
//        shapes.add(rectangle);
//
        shapes.add(circle);
//        shapes2.add(circle);

//        shapes.add(circle);
//        shapes2.add(rectangle);


        cloneAndCompare(shapes, shapes2);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
