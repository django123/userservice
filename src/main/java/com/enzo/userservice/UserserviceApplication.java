package com.enzo.userservice;

import com.enzo.userservice.domain.Role;
import com.enzo.userservice.domain.User;
import com.enzo.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.beans.BeanProperty;
import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication implements CommandLineRunner {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    };

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        System.err.println("Application run ...");
    }


}
