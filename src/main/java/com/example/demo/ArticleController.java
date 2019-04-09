package com.example.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;

@RestController
//控制器的注释，必写的注释
public class ArticleController {
    @Autowired
    //实例化这个接口，因为接口不能NEW  所以用这个方法进行调用。此处实例化后下方可以这个借口里面定义的东西
    ArticleRepository articleRepository;
    @RequestMapping("/list1")
    /*   @RequestMapping  注释确保HTTP请求到/greeting映射到greeting()方法。  主要用于制定访问地址
     *   默认可以映射所有的HTTP请求，不用制定GET或POST，可以是用method=GET   来缩短范围制定GET方式
     *
     * 这个类是设置一个列表返回Article表中 大于ID的数据。
     * 返回对象为List 列表，List<Article> 代表的是返回类型、内容是这个对象，以列表的形式展现出来
     *  @RequestParam(value = "id" ,defaultValue = "0"  valule 代表所填参数，defaultValue代表的是默认值，如果没有填写参数默认为什么
     *
     */
    public List<Article> getList1(@RequestParam(value = "id" ,defaultValue = "0") int id) {
        //创建一个List 对象类型，这里注意要与 类的返回值一致  list1为对象名称  articleRepository为上方实例化的接口
        //findByIdGreaterThan(id)为在articleRepository接口中定义的方法，在这里进行调用。  最后返回得到的数据
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
