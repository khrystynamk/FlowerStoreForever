package com.lab.flowerstore.user;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void add(AppUser user) {
        userRepository.save(user);
    }

    public Optional<AppUser> findUserByEmail(String email) {
        // AppUser userQuery = new AppUser();
        // userQuery.setEmail(email);
        // return userRepository.findOne(Example.of(userQuery));
        return userRepository.findUserByEmail(email);
    }
}
