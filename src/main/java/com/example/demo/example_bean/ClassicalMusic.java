package com.example.demo.example_bean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    List<String> musicList = new ArrayList<>();

    @PostConstruct
    public void init() {
        musicList.add("Classical Music 1");
        musicList.add("Classical Music 2");
        musicList.add("Classical Music 3");
    }

    @Override
    public String getSong() {
        return "Some Classical music";
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
