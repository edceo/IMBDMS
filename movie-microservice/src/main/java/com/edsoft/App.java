package com.edsoft;

import com.edsoft.domain.Movie;
import org.springframework.web.client.RestTemplate;

/**
 * Created by edsoft on 12/16/16.
 */
public class App {
    public static void main(String[] args) {
        RestTemplate rs = new RestTemplate();
        Movie m = rs.getForObject("http://localhost:2222/movies/detail/id/2",
                Movie.class);
        System.out.println(m.getTitle());
    }
}
