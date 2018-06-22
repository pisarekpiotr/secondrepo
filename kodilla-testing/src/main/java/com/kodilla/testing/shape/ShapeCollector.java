package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> shapes = new ArrayList<>() ;

    public ShapeCollector(Shape shape) {
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
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

      if (n >= 0 && n < shapes.size()) {
          return shapes.get(n);
      } else {
      }
      return null;
  }

  public String showFigures(){
        String result ="";
        for (Shape shape: shapes){
            result += shape.getShapeName();
        }
        return result;

  }

   public int getFiguresQuantity() {
       return shapes.size();
    }
}
