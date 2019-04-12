package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

/*  官方文档翻译，暂不细究
    @SpringBootApplication是一个方便的注释，它添加了以下所有内容：

    @Configuration将类标记为应用程序上下文的bean定义的源。

    @EnableAutoConfiguration告诉SpringBoot根据类路径设置、其他bean和各种属性设置开始添加bean。

    通常你会添加@EnableWebMvc对于SpringMVC应用程序，但是SpringBoot在看到Springwebmvc在类路径上。这会将应用程序标记为web应用程序，并激活关键行为，例如设置DispatcherServlet.

    @ComponentScan告诉Spring在hello包，让它找到控制器。
 *
 */
public class DemoApplication {


    public static void main(String[] args) {
        //运行spring的代码，默认生成文件 后期在学习
        SpringApplication.run(DemoApplication.class, args);
    }


}
