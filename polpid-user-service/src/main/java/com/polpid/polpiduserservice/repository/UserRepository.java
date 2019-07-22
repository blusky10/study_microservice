package com.polpid.polpiduserservice.repository;

import com.polpid.polpiduserservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);

}
