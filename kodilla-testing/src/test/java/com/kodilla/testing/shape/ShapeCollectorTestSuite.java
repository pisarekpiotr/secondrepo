package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigures(){
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        assertEquals(1,shapeCollector.getFiguresQuantity());
  }

    @Test
   public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));
        Circle circle = new Circle(2);
        //shapeCollector.addFigure(circle);

        boolean result = shapeCollector.removeFigure(circle);
        assertFalse(result);
        assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);

        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);

        System.out.println(retrievedShape);
        Assert.assertEquals(new Circle(2), retrievedShape);
    }

   @Test
  public void testShowFigures(){
   }
}
