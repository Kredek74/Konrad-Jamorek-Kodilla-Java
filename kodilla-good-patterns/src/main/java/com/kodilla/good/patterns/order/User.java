package com.kodilla.good.patterns.order;

public class User {

    String userNick;
    String userName;
    String userSurname;

    public User(String userNick, String userName, String userSurname) {
        this.userNick = userNick;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return userNick.equals(user.userNick);
    }

    @Override
    public int hashCode() {
        return userNick.hashCode();
    }
}
