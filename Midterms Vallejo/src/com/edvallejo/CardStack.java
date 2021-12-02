package com.edvallejo;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    public int size = 0;
    public CardStack(){
        stack = new LinkedList<Card>();
    }
    public void push(Card card){
        stack.push(card);
        ++size;
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public Card pop(){
        --size;
        return stack.pop();
    }
    public Card peek(){
        return stack.peek();
    }
    public void printStack(){
        ListIterator<Card> iterator = stack.listIterator();
        System.out.println("Printing stack: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
