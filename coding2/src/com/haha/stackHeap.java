package com.haha;

public class stackHeap {
    private static int index = -1;
    private static String [] obj = new String[10];

    public stackHeap()
    {}
    public static void push(String x){
        if(index<9){
            obj[++index]=x;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public static String pop(){
        String x=null;
        if(index>-1){
            x=obj[index];
            obj[index--]=null;
        }
        else{
            System.out.println("stack is empty");
        }
        return x;
    }
}
