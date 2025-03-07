package com.hangzhoudianzi.demo.mapper;


import com.hangzhoudianzi.demo.pojo.people.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> findAll();
    User findByName(String username);
    String findPswByName(String username);
    void save(User user);
}
