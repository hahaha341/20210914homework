package com.haha;
import java.io.File;
import java.util.Scanner;
public class branchMovement {
    public static int count;
    public branchMovement(){}
    public static void branch1(String[] keywordString,String filename){
        try {
            count=0;
            //通过scanner和new file的方法引入一个文本
            Scanner input = new Scanner(new File(filename));
            //hasnext方法再缓冲区内依次扫描单词
            while (input.hasNext()) {
                String token = input.next();//返回集合中的一个元素token
                for(int i=0;i<keywordString.length-1;i++)
                {
                    if(token.contains(keywordString[i])){
                        count++;
                        break;
                    }
                }
            }
            //统计结束，输出关键词的总个数
            System.out.println("total num: "
                    + count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branch2(String filename){
        try {
            int []result=new int[10000];
            count=0;
            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                String token = input.next();
                if (token.contains("switch")) {//找switch
                    count++;
                }
                if(token.contains("case")){
                    result[count]++;//对应case的个数加一
                }
            }
            System.out.println("switch num: "+count);
            System.out.print("case num: ");
            for(int i=1;i<=count;i++)
            {
                System.out.print(result[i]+" ");
            }
            System.out.print("\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branch3(String filename){
        try {
            count = 0;
            stackHeap.index=1;
            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                String token = input.next();//返回集合中的一个元素token
                if (token.contains("if")) {//是if
                    MyUtil.if_Fun();
                }
                else if(token.contains("else")){
                    String token1 = input.next();
                    String token3=null;
                    if(token1.contains("if")) {
                        token3=token+" "+"if";
                        if(token3.equals("else if")){//是else if，识别失败
                            MyUtil.elseif_Fun();
                            continue;
                        }
                        else{//不是else if,要同时将else和if进行处理
                            //先处理else
                            count=MyUtil.elseFun(count);
                            //再处理if
                            MyUtil.if_Fun();
                        }
                    }
                    else{//是else
                        count=MyUtil.elseFun(count);
                    }
                }
            }
            //统计结束，输出关键词的总个数
            System.out.println("if-else num: "
                    + count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branch4(String filename){
        try {
            count = 0;
            stackHeap.index=1;
            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                String token = input.next();//返回集合中的一个元素token
                if (token.contains("if")) {//如果token和keywordset集合中的元素有重合
                    MyUtil.if_Fun();
                }
                else if(token.contains("else")){
                    String token1 = input.next();
                    String token3=null;
                    if(token1.contains("if")) {
                        token3=token+" "+"if";
                        if(token3.equals("else if")){//是else if
                            MyUtil.elseif_Fun();
                        }
                        else{//不是else if,要同时将else和if进行处理
                            //先处理else
                            count=MyUtil.else_Fun(count);
                            //再处理if
                            MyUtil.if_Fun();
                        }
                    }
                    else{//是else
                        count=MyUtil.else_Fun(count);
                    }
                }
            }
            //统计结束，输出关键词的总个数
            System.out.println("if-elseif-else num: "
                    + count);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
