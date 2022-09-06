/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WalkingTree
 */
public class Test {
    public static void main(String args[]){
        
        int patternSize = 8;
        int j = (patternSize*2)-1;
        int space = 0;
        for(int i=0; i<patternSize; i++){
            for(int k=0; k<space; k++){
                System.out.print(" ");
            }
            if(i<(int)patternSize/2){
                printPattern(j, '*');
            }else{
                printPattern(j, '$');
            }
            j = j-2;
            space++;
        }
    }
    
    private static void printPattern(int size, char c){
        for(int i=0; i<size; i++){
            System.out.print(c);
        }
        System.out.println();
    }
   
}
