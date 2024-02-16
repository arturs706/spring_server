package com.example.apigw.demo.users.domain_layer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class StaffUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;

    private String name;
    private String username;
    private String mob_phone;
    private String passwd;
    private String acc_level;
    private String status;
    private LocalDateTime a_created;

    public StaffUsers() {
    }
    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob_phone() {
        return mob_phone;
    }

    public void setMob_phone(String mob_phone) {
        this.mob_phone = mob_phone;
    }

    public String getAcc_level() {
        return acc_level;
    }

    public void setAcc_level(String acc_level) {
        this.acc_level = acc_level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setA_created(LocalDateTime createdDateTime) {
        this.a_created = createdDateTime;
    }
}
