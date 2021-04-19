package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private static TaskFactory taskFactory;


    @Test
    void testFactoryShoppingTask() {
        //given
        taskFactory = new TaskFactory();
        //when
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean beforeExecute = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        //then
        assertEquals("Buy list", shoppingTask.getTaskName());
        assertFalse(beforeExecute);
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean beforeExecute = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertFalse(beforeExecute);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean beforeExecute = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //then
        assertEquals("Driving task", drivingTask.getTaskName());
        assertFalse(beforeExecute);
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryNullTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task nullTask = taskFactory.makeTask("null");
        //then
        assertNull(nullTask);
    }
}
