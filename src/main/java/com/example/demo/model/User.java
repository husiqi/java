package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import java.awt.font.TransformAttribute;

import static javax.persistence.GenerationType.IDENTITY;


@Table()
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Integer id;
    String name;
    @Column(nullable = false,columnDefinition = "int(2) comment '我是年龄注释...'")
    Integer age;
    String sex;
    Integer tel;
    String register_mode;
    Integer pid;
    @Column(nullable = false,columnDefinition = "varchar(20) comment '密码'")
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getRegister_mode() {
        return register_mode;
    }

    public void setRegister_mode(String register_mode) {
        this.register_mode = register_mode;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(String format) {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
