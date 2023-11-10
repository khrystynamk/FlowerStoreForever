package com.lab.flowerstore.user;

public class Sender extends AppUser {
    public void update(String status) {
        super.update("[RECEIVER]: " + status);
    }
}
