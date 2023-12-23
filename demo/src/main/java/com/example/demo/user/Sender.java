package com.example.demo.user;

public class Sender extends AppUser {
    public void update(String status) {
        super.update("[RECEIVER]: " + status);
    }
}
