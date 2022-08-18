/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akash.data.structure.linkedlist.linear;

/**
 *
 * @author WalkingTree
 */
public class SinglyLinkedList {
    
    Node next;
    
    static class Node { // this class is static so main method can access it.
        Node head;
        int data;
        Node(int data){
            this.data = data;
            this.head = null;
        }
    }
    
    private void insertElement(int data){
        Node node = new Node(data);
        if(next==null){
            next = node;
            return;
        }
        Node last = next;
        while(last.head!=null){
            last = last.head;
        }
        last.head = node;
    }
    
    private void insertElement(int data, int position){
        if(position<1)
           return;     
        Node node = new Node(data);
        if(next==null){
            next = node;
            return;
        }
        Node last = next;
        if(position == 0){
            node.head = last;
            next = node;
            return;
        }
        for(int i=0; i<position-1; i++){
            last = last.head;
        }
        node.head = last.head;
        last.head = node;
    }
    
    private void print(){
        Node n = next;
        while(n!=null){
            System.out.println(n.data);
            n = n.head;
        }
    }
    
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertElement(4);
        list.insertElement(2);
        list.insertElement(1);
        list.insertElement(8);
        list.insertElement(3);
        list.insertElement(5, 2);
        list.print();
    }
}
