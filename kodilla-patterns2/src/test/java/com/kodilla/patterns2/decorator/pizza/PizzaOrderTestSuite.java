package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cheese and tomato sauce", description);
    }

    @Test
    public void testMushroomPizzaOrderDecoratorGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testMushroomPizzaOrderDecoratorGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cheese and tomato sauce" + " + mushroom", description);
    }

    @Test
    public void testBaconPizzaOrderDecoratorGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(42), theCost);
    }

    @Test
    public void testBaconPizzaOrderDecoratorGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cheese and tomato sauce" + " + mushroom" + " + bacon" + " + bacon", description);
    }

    @Test
    public void testOnionPizzaOrderDecoratorGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new OnionPizzaOrderDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(34), theCost);
    }

    @Test
    public void testOnionPizzaOrderDecoratorGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new OnionPizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cheese and tomato sauce" + " + mushroom" + " + bacon" + " + onion", description);
    }

    @Test
    public void testArugulaLettucePizzaOrderDecoratorGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new OnionPizzaOrderDecorator(theOrder);
        theOrder = new ArugulaLettucePizzaOrderDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(41), theCost);
    }

    @Test
    public void testArugulaLettucePizzaOrderDecoratorGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomPizzaOrderDecorator(theOrder);
        theOrder = new BaconPizzaOrderDecorator(theOrder);
        theOrder = new OnionPizzaOrderDecorator(theOrder);
        theOrder = new ArugulaLettucePizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cheese and tomato sauce" + " + mushroom" + " + bacon" + " + onion" + " + arugulaLettuce", description);
    }
}
