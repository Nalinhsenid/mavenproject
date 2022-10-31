package org.Mavenproj;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    //    • id: int
    //    • name: String
    //    • age: int
    //    • subjects: List<String>
    private int id;
    private String name;

    private int age;
    
    private List<String> subjects;

}
