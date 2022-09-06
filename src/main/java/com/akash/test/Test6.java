/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

/**
 *
 * @author WalkingTree
 */
public class Test6 {
    public static void main(String args[]){
        test(new Employee("2", 2));
    }
    
    private static void test(Object obj){
        System.out.println("obj");
    }
    
    private static void test(Employee obj){
        System.out.println("emp obj");
    }
    
    private static void test(String obj){
        System.out.println("string");
    }
    
    private static void test(Integer obj){
        System.out.println("int");
    }
    
    private static void test(Double obj){
        System.out.println("double");
    }
    
    private static void test(Long obj){
        System.out.println("long");
    }
    
    private static void test(Short obj){
        System.out.println("short");
    }
}
