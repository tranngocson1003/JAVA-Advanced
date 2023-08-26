package com.vti;

import com.vti.entity.Circle;
import com.vti.entity.Rectangle;
import com.vti.repository.ShapeRepository;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        ShapeRepository repository = new ShapeRepository();

        Circle circle = new Circle();
        circle.setId(100);
        circle.setName("Circle A");
        circle.setColor("Red");
        circle.setRadius(10);
        repository.createShape(circle);


        Rectangle rectangle = new Rectangle();
        rectangle.setId(1000);
        rectangle.setName("Rectangle A");
        rectangle.setColor("Blue");
        rectangle.setWidth(20);
        rectangle.setHeight(30);
        repository.createShape(rectangle);

        List<Circle> circles = repository.findAllCircle();
        for (Circle c : circles){
            System.out.println("Circle id" + c.getId());

            System.out.println("Circle name" + c.getName());

            System.out.println("Circle color" + c.getColor());

            System.out.println("Circle radius" + c.getRadius());
        }

    }
}
