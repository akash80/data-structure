/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author WalkingTree
 */
public class Test4 {
    public static void main(String args[]){
        // member of characters 
        String s = "akash";
        s.chars().distinct().reduce((c1,c2)->(c1>c2?c1:c2));
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }
        System.out.println(map);
    }
}
