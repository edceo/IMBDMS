package com.edsoft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by yusuf on 13.11.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {

        List<String> list = Files.readAllLines(Paths.get("/home/yusuf/Desktop/ratings.dat"));
        System.out.println(list.get(0));
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (String s : list) {
            builder.append(i).append("::").append(s);
            builder.append("\n");
            i++;
        }
        Files.write(Paths.get("/home/yusuf/Desktop/rat.dat"), builder.toString().getBytes());

    }
}
