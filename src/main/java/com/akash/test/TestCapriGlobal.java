/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author WalkingTree
 */
public class TestCapriGlobal {
    public static void main(String args[]){
        String s = "helloworld";
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            list.add(s.charAt(i)+"");
        }
        list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((k,v)->{
            System.out.println(k+" | "+v);
        });
        
    }
}
