/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

/**
 *
 * @author WalkingTree
 */
public class Test3 {
    public static void main(String[] args) {
        int size = 7;
        int j = 1;
        for(int i=0; i<size; i++){
            if(i<=(size/2)){
               printStar(i+1);
               System.out.println("");
            }else{
                printStar(i-j);
                j = j + 2;
                System.out.println("");
            }
        }
    }
    
    private static void printStar(int i){
        if(i>0){
            System.out.print("*");
            i--;
            printStar(i);
        }
    }
}
