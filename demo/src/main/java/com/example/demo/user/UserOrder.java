package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;

public class UserOrder {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
        }
        else {
            System.out.println("There is no such user!");
        }
    }

    public void order() {
        System.out.println("Ordering");
        notifyUsers();
        System.out.println("Ordered");
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("Notified");
        }
    }
}
