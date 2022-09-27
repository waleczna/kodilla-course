package com.kodilla.patterns.factory.tasks;

class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isExecuted = false;

    DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("[" + taskName + "] Driving to the " + where + " by " + using);
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
