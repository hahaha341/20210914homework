package com.haha;

public class MyUtil {
    MyUtil(){}
    public static void if_Fun(){
        try{
            stackHeap.push("if");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void elseif_Fun(){
        try{
            stackHeap.push("else if");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static int else_Fun(int count1){
        try{
            String x=null;
            x=stackHeap.pop();
            if(x.equals("else if")){//如果是else if，则计数
                count1++;
                do{//之后不断抛出栈顶元素，并检验
                    x=stackHeap.pop();
                }
                while(!x.equals("if"));//如果抛出的栈顶元素是if，抛出结束
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return count1;
    }
    public static int elseFun(int count1) {
        try {
            String x = null;
            x = stackHeap.pop();//栈顶出战
            if (x.equals("if")) {//如果出栈的是if，则计数，如果不是，则不计数
                count1++;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return count1;
    }
}
