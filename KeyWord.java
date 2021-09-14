import java.util.*;
import java.io.*;

public class KeyWord {
    public static void main(String[] args) {
        // Check usage
        /*if (args.length != 1) {
            System.out.println("Usage: Test.java");
            System.exit(0);
        }*/



        //所有的java的关键词
        String[] keywordString = {"abstract", "finally", "public",
                "boolean", "float", "return", "break", "for", "short", "byte",
                "goto", "static", "case", "if", "super", "catch", "implements",
                "switch", "char", "import", "synchronized", "class",
                "instanceof", "this", "const", "int", "throw", "continue",
                "interface", "throws", "default", "long", "transient", "do",
                "native", "try", "double", "new", "void", "else", "package",
                "volatile", "extends", "private", "while", "final",
                "protected", "true", "null"};
        //将字符串数组转化成一个集合，集合的名字时keywordset
        Set<String> keywordSet =
                new HashSet<String>(Arrays.asList(keywordString));
        int count = 0;

        try {
            //通过scanner和new file的方法引入一个文本
            Scanner input = new Scanner(new File("sources.txt"));
            //hasnext方法再缓冲区内依次扫描单词
            while (input.hasNext()) {
                String token = input.next();//返回集合中的一个元素token
                if (keywordSet.contains(token))//如果token和keywordset集合中的元素有重合
                    count++;//关键词个数加一
            }
            //统计结束，输出关键词的总个数
            System.out.println("The number of keywords in the program is "
                    + count);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


