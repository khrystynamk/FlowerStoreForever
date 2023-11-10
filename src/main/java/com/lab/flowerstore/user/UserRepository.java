package com.lab.flowerstore.user;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser> findUserByEmail(String email);
}
