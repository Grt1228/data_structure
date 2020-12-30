package com.unfbx.stack;

/**
 * @Description
 * @Author Grt
 * @Date 2020-12-29
 */
public class ArrayStackDemo {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(7);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}

class ArrayStack{

    private int size;
    private int[] stack;
    private int top = -1;

    public ArrayStack(int size){
        this.size =size;
        this.stack = new int[size];
    }

    /**
     * 入栈
     * @param num
     */
    public void push(int num){
        if(top == size-1){
            System.out.println("~~~~~~~~~~~~~~~满了");
            return;
        }
        this.top++;
        this.stack[top] = num;
    }

    public int pop(){
        if(top == -1){
            System.out.println("~~~~~~~~~~~~~~~空的");
            throw new RuntimeException("~~~~~~~~~~~~~~~~~~~~~~~没数据");
        }
        int value = this.stack[top];
        top--;
        return value;
    }
}