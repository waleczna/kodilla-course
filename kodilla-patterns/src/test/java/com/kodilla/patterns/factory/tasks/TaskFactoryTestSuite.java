package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void shouldCreatePaintingTask() {
        //given
        Task task = TaskFactory.getTask(TaskFactory.PAINTING_TASK);
        task.executeTask();
        //when
        boolean result = task.isTaskExecuted();
        //then
        assertTrue(result);
    }
}