package com.rxjava;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    private static List<Task> tasks;

    public static List<Task> getData() {
        if (tasks == null) {
            tasks = new ArrayList<>();
            tasks.add(new Task("Good morning",true,1));
            tasks.add(new Task("Good afternoon",false,2));
            tasks.add(new Task("Good evening",true,3));
            tasks.add(new Task("Good night",true,4));
            tasks.add(new Task("Good noon",false,5));
        }
        return tasks;
    }

    public static String[] getStringArray() {
        return new String[]{"a", "b", "c", "d","a", "b", "c", "d","a", "b", "c", "d"};
    }


}
