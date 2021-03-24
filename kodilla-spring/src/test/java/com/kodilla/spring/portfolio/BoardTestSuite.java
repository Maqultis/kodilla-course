package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("to do task");
        board.getInProgressList().addTask("in progress task");
        board.getDoneList().addTask("done task");

        //when & then
        assertEquals("to do task", board.getToDoList().getTasks().get(0));
        assertEquals("in progress task", board.getInProgressList().getTasks().get(0));
        assertEquals("done task", board.getDoneList().getTasks().get(0));
    }
}
