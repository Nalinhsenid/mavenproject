package org.Mavenproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Calculator c1 = new Calculator();
        //System.out.println(c1.square(10));


        //Add student
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("John");
        s1.setAge(20);
        List<String> s1_subjects = new ArrayList<>(Arrays.asList("Maths", "English", "History"));
        s1.setSubjects(s1_subjects);


        System.out.println("Id : " + s1.getId());
        System.out.println("Name : " + s1.getName());
        System.out.println("Age : "  + s1.getAge());
        System.out.println("Subjects : " + s1.getSubjects());




    }
}