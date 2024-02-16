package com.example.apigw.demo.users.infrastructure_layer;

import com.example.apigw.demo.users.domain_layer.StaffUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<StaffUsers, UUID> {

    List<StaffUsers> findAll();

    StaffUsers getById(UUID userId);

    StaffUsers save(StaffUsers user);

    StaffUsers getStaffUserByUsernameAndPasswd(String username, String passwd);

}