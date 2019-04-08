package com.example.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleRepository articleRepository;


    @RequestMapping("/list1")
    public List<Article> getList1(@RequestParam("id") int id) {

        List<Article> list1 =articleRepository.findByIdGreaterThan(id);
        return list1;

    }

    @PostMapping(value = "/article" )
    public String postSaveUser(@RequestBody Article user){
//        User user = new User();
//        user.setName(name);
        //      user.setSex("");
        articleRepository.save(user);
        return "插入成功";
    }
}
