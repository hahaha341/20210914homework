import java.util.Scanner;

public class Key_Word {
    public static void main(String[] args) {
        //所有的c的关键词
        String[] keywordString = {"auto", "break", "case",
                "char", "const", "continue", "default", "do", "double", "else",
                "enum", "extern", "float", "for", "goto", "if", "int",
                "long", "register", "return", "short", "signed",
                "sizeof", "static", "struct", "switch", "typedef", "union",
                "unsigned", "void", "volatile", "while"};
        int []result=new int [10];
        /*// Check usage
        if (args.length != 1) {
            System.out.println("Usage: Test.java");
            System.exit(0);
        }*/
        Scanner s = new Scanner(System.in);
        int branch = s.nextInt();
        if (branch == 1) {
            branchMovement.branch1(keywordString);
        }
        else if(branch ==2){
            branchMovement.branch2(result);
        }
        else if(branch == 3){
            branchMovement.branch3();
        }
        else if(branch == 4){
            branchMovement.branch4();
        }
}
    }

