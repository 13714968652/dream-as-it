package com.it.xb.microserviceuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.xb.microserviceuser.entity.User;

/**
 * JPA连接
 * @author Administrator
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{


}
