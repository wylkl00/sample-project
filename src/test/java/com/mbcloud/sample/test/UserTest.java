package com.mbcloud.sample.test;

import com.mbcloud.sample.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Test
    public void test(){
        System.out.println("Hello world");
    }
}
