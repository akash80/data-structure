/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.data.structure.linkedlist.linear;

/**
 *
 * @author WalkingTree
 */
public class Queue {
    int MAX;
    int front,rear,size;
    int[] arr;
    Queue(int capacity){
        front = -1;
        MAX = capacity;
        front = size = 0;
        rear = MAX-1;
        arr = new int[MAX];
    }
    
    private void push(int data){
        if(size>=(MAX-1)){
            System.out.println("Stack overflow");
        }else{
            arr[size++] = data;
        }
    }
    
    private void pop(){
        if(front>=size){
            System.out.println("Stack unoverflow");
        }else{
            ++front;
        }
    }
    
    private void print(){
        for(int i=front; i<size; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]){
        Queue queue = new Queue(10);
        queue.push(5);
        queue.push(4);
        queue.push(6);
        queue.pop();
        queue.print();
    }
}
