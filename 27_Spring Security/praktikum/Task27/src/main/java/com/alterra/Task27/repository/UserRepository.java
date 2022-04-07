package com.alterra.Task27.repository;

import com.alterra.Task27.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel getDistinctTopByUsername(String username);
}
