/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author WalkingTree
 */
public class StreamLearn {
    public static void main(String args[]){
        // string to stream
        String str = "this is string";
        IntStream stream1 = str.chars();
        
        // array to stream
        int[] ints = new int[]{2,5,6,22,4,6,2,2,5,3};
        IntStream stream2 = Arrays.stream(ints);
        
        // for collection api use stream() method
        List<Student> list = new ArrayList<>();
        Set<Address> addresses = new TreeSet<>();
//        addresses.add(new Address("Lawyers Colony"));
        list.add(new Student("prakash",1,null));
        list.add(new Student("akash",2,null));
//        Callable
        Stream<Student> s =list.stream().sorted((obj1, obj2) -> obj1.getName().length()>obj2.getName().length() ? 1:-1);
        s.forEach(System.out::println);
        // filter
//        distinct(stream2);
    }
    
    private static void distinct(IntStream stream){
        stream.distinct().forEach(System.out::println);
    }
    
    private static void streamFilter(IntStream stream){
        // use interface Predicate
        
    }
    
    private static void streamSorted(){
        // use interface Comparator
        
    }
    
    private static void streamMap(){
        // use interface Function
        
    }
}
