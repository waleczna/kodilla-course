package com.kodilla.patterns.factory.tasks;

class TaskFactory {

    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String SHOPPING_TASK = "ShoppingTask";

    public static Task getTask(String taskName){
        switch (taskName) {
            case PAINTING_TASK: return new PaintingTask( "Wall renewal", "green", "wall");
            case DRIVING_TASK: return new DrivingTask("Going to school", "school", "bus");
            case SHOPPING_TASK: return new ShoppingTask("Buying bread", "bread", 1.0);
            default: return null;
        }
    }
}
