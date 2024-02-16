package com.example.apigw.demo.users.application_layer;

import com.example.apigw.demo.users.domain_layer.StaffUsers;
import com.example.apigw.demo.users.infrastructure_layer.UserRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<StaffUsers> getAllUsers() {
        return userRepository.findAll();
    }

    public StaffUsers getUserById(UUID userId) {
        return userRepository.getById(userId);
    }

    public StaffUsers registerUser(StaffUsers user) {
        user.setUser_id(UUID.randomUUID());
        user.setA_created(LocalDateTime.now());
        return userRepository.save(user);
    }

    public StaffUsers loginUser(String username, String passwd) {
        return userRepository.getStaffUserByUsernameAndPasswd(username, passwd);
    }
}
