package com.example.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/helloword")
    //制定访问路径可加GET参数(？后面加参数)
    public User helloword(@RequestParam(value ="name",defaultValue ="胡思琦" ) String name) {

        //User user1= String.format(template, name);
        User user1=new User();
        user1.setName(name);
        userRepository.save(user1);
        //return new User (id,String.format(template, name));
        return user1;
    }


    @RequestMapping("/hello")
    //制定访问路径可加GET参数(？后面加参数)
    public User index(@RequestParam("id") Integer id) {

        User user1 = userRepository.findById(id).orElse(null);
        return user1;
    }


    @RequestMapping("/insert/{name}")
    //也是get参数传，如insert/hu
    public Object insert(@PathVariable("name") String name) {

        User user2 = new User();//   userRepository.findById(id).orElse(null);
        // user2.setId(10000);
        user2.setName(name);
        userRepository.save(user2);
        return user2;
    }

    @RequestMapping("/list")
    public List<User> getList(@RequestParam("id") int id) {

        List<User> list = userRepository.findByIdGreaterThan(id);
        return list;

    }


}
