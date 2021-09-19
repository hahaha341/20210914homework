package com.haha;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class branchMovement {
    public static int count;
    public branchMovement(){}
    public static void branch1(String[] keywordString,String filename){
        count=0;
        //将字符串数组转化成一个集合，集合的名字时keywordset
        Set<String> keywordSet =
                new HashSet<String>(Arrays.asList(keywordString));

        try {
            //通过scanner和new file的方法引入一个文本
            Scanner input = new Scanner(new File(filename));
            //hasnext方法再缓冲区内依次扫描单词
            while (input.hasNext()) {
                String token = input.next();//返回集合中的一个元素token
                if (keywordSet.contains(token))//如果token和keywordset集合中的元素有重合
                    count++;//关键词个数加一
            }
            //统计结束，输出关键词的总个数
            System.out.println("total num: "
                    + count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branch2(String filename){
        int []result=new int[10];
        count=0;
        int flag =0;int flag1=0;
        for(int i=0;i<10;i++) result[i]=0;
        try {
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branch3(String filename){
        count = 0;
        try {
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
        count = 0;
        try {
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
