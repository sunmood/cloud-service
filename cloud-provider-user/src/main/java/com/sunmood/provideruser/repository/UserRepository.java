package com.sunmood.provideruser.repository;

import com.sunmood.provideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sunmood on 2018/11/26.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
