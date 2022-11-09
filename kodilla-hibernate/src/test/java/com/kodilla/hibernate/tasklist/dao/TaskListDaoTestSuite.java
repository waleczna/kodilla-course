package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Test
    void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList("In Progress", "Task In Progress");
        taskListDao.save(tasklist);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName("In Progress");

        //Then
        assertEquals(1, readTaskList.size());

        //CleanUp
        Integer id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }

}