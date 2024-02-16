package com.example.apigw.demo.users.presentation_layer;

import com.example.apigw.demo.users.application_layer.UserService;
import com.example.apigw.demo.users.domain_layer.StaffUsers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<StaffUsers>> getAllUsers() {
        try {
            List<StaffUsers> users = userService.getAllUsers();
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<StaffUsers> getUserById(@PathVariable UUID user_id) {
        try {
            StaffUsers user = userService.getUserById(user_id);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<StaffUsers> registerUser(@RequestBody StaffUsers user) {
        try {
            StaffUsers registeredUser = userService.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<StaffUsers> loginUser(@RequestBody StaffUsers user) {
        try {
            StaffUsers loggedInUser = userService.loginUser(user.getUsername(), user.getPasswd());
            return ResponseEntity.ok(loggedInUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}