package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, Integer> returnMap(List<String> strings) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String element : strings) {
            if (stringIntegerMap.containsKey(element)) {
                stringIntegerMap.put(element, stringIntegerMap.get(element) + 1);
            } else {
                stringIntegerMap.put(element, 1);
            }
        }
        return stringIntegerMap;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JVM");
        list.add("JRE");
        list.add("JVM");
        list.add("JVM");
        list.add("JDK");
        list.add("JDK");
        list.add("JDK");
        list.add("JVM");
        list.add("JVM");
        list.add("JRE");
        list.add("JRE");
        list.add("JRE");
        Map<String, Integer> resultMap = returnMap(list);
        System.out.println(resultMap);
    }
}