package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: task list Dao finding by list name.";

    @Test
    void testTaskListDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList("list name", DESCRIPTION);
        taskListDao.save(taskList);
        String taskname = taskList.getListName();
        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(taskname);
        //Then
        System.out.println(taskname);
        assertEquals("list name", taskname);

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
