package com.edsoft;

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
        map.put(3, "admin");
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

        List<String> list = Files.readAllLines(Paths.get("/home/yusuf/Desktop/us.dat"));
        System.out.println(list.get(0));
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (String s : list) {
            builder.append(i).append("::").append(s);
            builder.append("\n");
            i++;
        }
        Files.write(Paths.get("/home/yusuf/Desktop/us.dat"), builder.toString().getBytes());

    }
}
