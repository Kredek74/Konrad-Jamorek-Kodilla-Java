package com.kodilla.good.patterns.order;

public class MessageSender implements InformationService {

    @Override
    public void informUser(User user) {
        System.out.println("Hello " + user.getUserNick() + "!" + "\n" + "Thank you for an order.");
    }
}
