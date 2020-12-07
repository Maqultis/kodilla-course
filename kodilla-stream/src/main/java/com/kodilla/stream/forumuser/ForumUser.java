package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int forumID;
    private final String username;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postAmount;

    public ForumUser(final int forumID, final String username, final char sex,
                     final LocalDate birthdayDate, final int postAmount) {
        this.forumID = forumID;
        this.username = username;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postAmount = postAmount;
    }

    public int getForumID() {
        return forumID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumID=" + forumID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postAmount=" + postAmount +
                '}';
    }
}
