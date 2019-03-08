package com.itheima.test;

import com.itheima.SpringbootJpaApplication;
import com.itheima.user.domain.User;
import com.itheima.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAll(){
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

    @Test
    public void findById(){

    }

}
