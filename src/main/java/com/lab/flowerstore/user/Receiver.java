package com.lab.flowerstore.user;

public class Receiver extends AppUser {
    public void update(String status) {
        super.update("[RECEIVER]: " + status);
    }
}
