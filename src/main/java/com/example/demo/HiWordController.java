package com.example.demo;

import com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HiWordController {

    @Autowired
    UserRepository userRepository;


    @RequestMapping("/test")
    public User getUser() {
        User user = new User();
        //user.setId(10009);
        user.setName("小明");
        user.setAge(100);
        user.setSex("男");
        userRepository.save(user);
//        RetuenTest a=new RetuenTest();
//        a.setAge(user.getAge());
//        a.setName(user.getName());

        return user;
    }


    @PostMapping(value = "/test2" )
    public String postSaveUser(@RequestBody User user){
//        User user = new User();
//        user.setName(name);
  //      user.setSex("");
        userRepository.save(user);
        return "插入成功";
    }

}