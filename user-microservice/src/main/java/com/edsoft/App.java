package com.edsoft;

import com.edsoft.domain.User;
import org.springframework.web.client.RestTemplate;

/**
 * Created by edsoft on 12/17/16.
 */
public class App {
    public static void main(String[] args) {
        RestTemplate rs = new RestTemplate();
        User u = rs.getForObject("http://localhost:3333/api/users/2",
                User.class);
        System.out.println(u.getGenre());
    }
}
