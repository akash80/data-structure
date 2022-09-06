/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

import com.akash.stream.Department;
import com.akash.stream.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 *
 * @author WalkingTree
 */
public class Test7 {
    public static void main(String args[]){
        Map<Department,List<Student>> map = new HashMap<>();
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("akash", 1, null));
//        students.add(new Student("rahul", 2, null));
//        students.add(new Student("arman", 3, null));
//        students.stream().filter(e -> e.getName().startsWith("a")).collect(Collectors.groupingBy(Address::getAddress()));

        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("k");        
        ls.add("a");
        ls.add("s");
        ls.add("h");
        Map<String, Long> mapList = ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mapList.forEach((k,v) ->{
            System.out.println("K: "+k +" | "+"V: "+v);
        });
        Optional<String> l = ls.stream().filter(e -> Collections.frequency(ls, e) < 2).findFirst();
        if(l.isPresent())
            System.out.println(l.get());
    }
}
