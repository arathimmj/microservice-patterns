package com.stackroute.SpringBoot_Restful_Service.repository;

import com.stackroute.SpringBoot_Restful_Service.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
