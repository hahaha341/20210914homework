package com.haha;

import java.io.File;
import java.util.Scanner;
//文本注释切分函数
public class processing {
    public static void process(String filename){
        try {
            String token;
            int index=0;
            Scanner input = new Scanner(new File(filename));
            int flag1=0;
            int flag2=0;
            while (input.hasNextLine()) {
                token = input.nextLine();//逐行输入
                char[] charArray = token.toCharArray();
                for(int i=0;i<token.length();i++){//对于一行进行遍历
                    if(charArray[i]=='/'){
                        if(charArray[i+1]=='/'){
                              for(int j=i;j<token.length();j++){
                                  charArray[j]=' ';
                              }
                        }
                        if(charArray[i+1]=='*'&&flag1==0)//要保证下一个字符不对整体判断进行干扰
                        {
                            flag1=1;
                            charArray[i]=' ';
                            charArray[i+1]=' ';
                        }
                    }
                    if(charArray[i]=='*'&&flag1==1){
                        flag1=0;
                        charArray[i]=' ';
                        if(i+1<token.length()) charArray[i+1]=' ';
                    }
                    if(charArray[i]=='"'&&flag2==0){
                        flag2=1;
                        charArray[i]=' ';
                        continue;
                    }
                    if(charArray[i]=='"'&&flag2==1){
                        flag2=0;
                        charArray[i]=' ';
                        continue;
                    }
                    if(flag1==1||flag2==1){//无论如何，先进行判断，再进行删除，不容易误判
                        charArray[i]=' ';
                    }
                }
                //对应行的字符串要更新
                token="";
                for(int i=0;i< charArray.length;i++){
                    token+=charArray[i];
                }
                System.out.println("haha? "+token);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
