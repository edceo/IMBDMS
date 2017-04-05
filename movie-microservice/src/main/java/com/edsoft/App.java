package com.edsoft;

import com.edsoft.domain.Movie;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yusuf on 13.11.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "other");
        map.put(1, "academic");
        map.put(2, "artist");
        map.put(3, "clerical");
        map.put(4, "grad student");
        map.put(5, "customer service");
        map.put(6, "doctor");
        map.put(7, "executive");
        map.put(8, "farmer");
        map.put(9, "homemaker");
        map.put(10, "student");
        map.put(11, "lawyer");
        map.put(12, "programmer");
        map.put(13, "retired");
        map.put(14, "sales");
        map.put(15, "scientist");
        map.put(16, "self-employed");
        map.put(17, "engineer");
        map.put(18, "tradesman");
        map.put(19, "unemployed");
        map.put(20, "writer");


        List<String> list = Files.readAllLines(Paths.get("/home/edsoft/Desktop/users.dat"));
        System.out.println(list.get(0));
        StringBuilder builder = new StringBuilder();
        for (String s : list) {
            String[] split = s.split("::");
            builder.append(split[0]).append(",")
                    .append(split[1]).append(",")
                    .append(split[2]).append(",")
                    .append(map.get(Integer.parseInt(split[3]))).append(",")
                    .append(split[4]).append(",")
                    .append(Long.toHexString(Double.doubleToLongBits(Math.random())).substring(10))
                    .append("\n");
        }
        Files.write(Paths.get("/home/edsoft/Desktop/us1.csv"), builder.toString().getBytes());

//        RestTemplate template = new RestTemplate();
//        Movie m = template.getForObject("http://localhost:2222/movie/", Movie.class);
//        System.out.println(m.getTitle());
    }
}
