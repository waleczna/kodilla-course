package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardTestSuite {


    @Autowired
    private Board board;

    @Autowired
    private TaskList toDoList;

    @Test
    void shouldAddTask() {

     // given
        toDoList.getTasks().add("Task1");
     //when
        String result = board.getToDoList().getTasks().get(0);

     // then
        Assertions.assertEquals("Task1", result);
    }

}