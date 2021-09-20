package com.haha;

public class stackHeap {
    public static int index ;
    private static String [] obj = new String[10000];

    public stackHeap()
    {}
    public static void push(String x){
        if(index<10000){
            obj[++index]=x;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public static String pop(){
        String x=null;
        if(index>1){
            x=obj[index];
            obj[index--]=null;
        }
        else{
            System.out.println("stack is empty");
        }
        return x;
    }
}
