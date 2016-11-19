package com.edsoft;

import com.edsoft.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieMicroserviceApplicationTests {

    @Autowired
    private MovieService movieService;

    @Test
    public void contextLoads() {
    }

}
