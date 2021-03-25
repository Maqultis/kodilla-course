package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //given
        Logger logger = Logger.INSTANCE;
        logger.log("last log");
        //when
        String log = logger.getLastLog();
        //then
        assertEquals("last log", log);
    }
}
