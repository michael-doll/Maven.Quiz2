package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String,String> ourMap = new HashMap<>();
    public void add(String path, String controller) {
        ourMap.put(path,controller);
    }

    public Integer size() {
        return ourMap.size();
    }

    public String getController(String path) {
        return ourMap.get(path);
    }

    public void update(String path, String studentController) {
        ourMap.put(path,studentController);
    }

    public void remove(String path) {
        ourMap.remove(path);
    }
}
