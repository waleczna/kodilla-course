package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTestSuite {

    @Test
    void shouldAddAndGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);
        //when
        shapeCollector.addFigure(circle);
        //then
        assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    void shouldRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 15);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        //when
        boolean result = shapeCollector.removeFigure(circle);
        //then
        assertEquals(rectangle, shapeCollector.getFigure(0));
        assertTrue(result);
    }
}