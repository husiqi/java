package com.example.demo.repository;

import com.example.demo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository  extends JpaRepository<Article, Integer> {
    List< Article> findByIdGreaterThan(Integer s);//查询出所有大于这个 S 的数据

    //定义接口，好在其他页面调用
    //Article findByNameLike(String s);
    //List< Article> findByTop(String t);

}
