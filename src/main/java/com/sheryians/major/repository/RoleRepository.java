package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.model.Role;

//import com.nimbusds.oauth2.sdk.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
