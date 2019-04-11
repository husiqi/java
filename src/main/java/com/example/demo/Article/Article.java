package com.example.demo.Article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Table()
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = IDENTITY)  //创建表的时候ID自增
    Integer id;
    String title;
    String content;
    String top;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }


}