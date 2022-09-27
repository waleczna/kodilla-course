package com.kodilla.patterns.factory.tasks;

class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    private boolean isExecuted = false;

    PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("[" + taskName + "] painting the " + whatToPaint + " with " + color + " color");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
