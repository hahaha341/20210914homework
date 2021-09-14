import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Key_Word {
    public static void main(String[] args) {
        //所有的c的关键词
        String[] keywordString = {"auto", "break", "case",
                "char", "const", "continue", "default", "do", "double", "else",
                "enum", "extern", "float", "for", "goto", "if", "int",
                "long", "register", "return", "short", "signed",
                "sizeof", "static", "struct", "switch", "typedef", "union",
                "unsigned", "void", "volatile", "while"};
        String[] keywordString1 = {"switch", "case"};
        int []result=new int [10];
        /*// Check usage
        if (args.length != 1) {
            System.out.println("Usage: Test.java");
            System.exit(0);
        }*/
        Scanner s = new Scanner(System.in);
        int branch = s.nextInt();
        if (branch == 1) {
            //将字符串数组转化成一个集合，集合的名字时keywordset

            Set<String> keywordSet =
                    new HashSet<String>(Arrays.asList(keywordString));
            int count = 0;

            try {
                //通过scanner和new file的方法引入一个文本
                Scanner input = new Scanner(new File("sources1.txt"));
                //hasnext方法再缓冲区内依次扫描单词
                while (input.hasNext()) {
                    String token = input.next();//返回集合中的一个元素token
                    if (keywordSet.contains(token))//如果token和keywordset集合中的元素有重合
                        count++;//关键词个数加一
                }
                //统计结束，输出关键词的总个数
                System.out.println("The number of keywords in the program is "
                        + count);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(branch ==2){
            int flag =0;int flag1=0;
            for(int i=0;i<10;i++) result[i]=0;
            Set<String> keywordSet =
                    new HashSet<String>(Arrays.asList(keywordString1));
            int count = 0;
            try {
                Scanner input = new Scanner(new File("sources2.txt"));
                while (input.hasNext()) {
                    String token = input.next();
                    if (token.contains("switch")) {//找switch
                        if(flag!=flag1){//之前在统计case，找到了一个新的switch头头
                            flag1++;
                        }
                        if(flag==flag1){//找到了一个switch头头，数组的索引加一，flag再加一
                            count++;
                            flag++;
                        }
                    }
                    if(token.contains("case")){
                        result[count]++;//对应case的个数加一
                    }
                }
                System.out.println("有"+count+"组switch case语句");
                for(int i=0;i<count;i++)
                {
                    System.out.println("第"+(i+1)+"组有"+result[count]+"个case");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
