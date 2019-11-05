package com.mengxuegu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//该注解会扫描mapper包下面所有的mapper接口就可以不用再每一个mapper上面添加@Mapper这个注解
@MapperScan("com.mengxuegu.springboot.mapper")
@SpringBootApplication
public class SpringBoot08DataMybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08DataMybaitsApplication.class, args);
    }

}
