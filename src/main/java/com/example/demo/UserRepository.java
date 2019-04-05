package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByIdGreaterThan(Integer s);
    //定义接口，好在其他页面调用
    User findByNameLike(String s);
}
