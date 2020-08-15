package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Bruce Lee", 'M', 1991, 4, 19, 1));
        forumUsers.add(new ForumUser(2, "Chuck Norris", 'M', 2012, 6, 29, 31));
        forumUsers.add(new ForumUser(3, "Arnold Schwarzenegger", 'M', 2001, 12, 06, 42));
        forumUsers.add(new ForumUser(4, "Julia Roberts", 'F', 2010, 8, 10, 43));
        forumUsers.add(new ForumUser(5, "Jean-Claude Van Damme", 'M', 2007, 9, 22, 25));
        forumUsers.add(new ForumUser(6, "Sandra Bullock", 'F', 2007, 12, 23, 66));
        forumUsers.add(new ForumUser(7, "Charlie Sheen", 'M', 2009, 3, 23, 99));
        forumUsers.add(new ForumUser(8, "Pamela Anderson", 'F', 1995, 6, 11, 1));
        forumUsers.add(new ForumUser(9, "Jhonny Deep", 'M', 1999, 9, 9, 15));
        forumUsers.add(new ForumUser(10, "Leonardo Di Caprio", 'M', 2000, 1, 1, 134));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}