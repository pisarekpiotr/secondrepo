package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    public ArrayList<Shape> shapes = new ArrayList<>() ;

    public ShapeCollector(Shape shape) {
    }

    public void addFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        Circle circle = new Circle(2);
        shapes.add(circle);
    }

  public boolean removeFigure(Shape shape) {
      boolean result = false ;
      if (shapes.contains(shape)){
          shapes.remove(shape);
         result = true;
     }
     return result;
  }

  public Shape getFigure(int n) {
       return shapes.get(n);
  }

  public void showFigures(){
  }

   public int getFiguresQuantity() {
       return shapes.size();
    }
}
