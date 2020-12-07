package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(22, "Asiek", 'F',
                LocalDate.of(1992, Month.NOVEMBER, 1), 10));
        userList.add(new ForumUser(45, "Piota", 'M',
                LocalDate.of(1994, Month.MAY, 31), 666));
        userList.add(new ForumUser(69, "Borubar", 'M',
                LocalDate.of(2003, Month.JUNE, 6), 69));
        userList.add(new ForumUser(11, "Vegeta", 'M',
                LocalDate.of(1985, Month.FEBRUARY, 5), 3));
        userList.add(new ForumUser(33, "L", 'M',
                LocalDate.of(2002, Month.JANUARY, 1), 0));
        userList.add(new ForumUser(44, "Ruda Grazyna", 'F',
                LocalDate.of(1991, Month.DECEMBER, 23), 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
