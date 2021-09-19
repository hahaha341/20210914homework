package com.haha;

public class Key_Word {

    public static void main(String[] args) {
        //所有的c的关键词
        String[] keywordString = {"auto", "break", "case",
                "char", "const", "continue", "default", "do", "double", "else",
                "enum", "extern", "float", "for", "goto", "if", "int",
                "long", "register", "return", "short", "signed",
                "sizeof", "static", "struct", "switch", "typedef", "union",
                "unsigned", "void", "volatile", "while"};
        /*// Check usage
        if (args.length != 1) {
            System.out.println("Usage: Test.java");
            System.exit(0);
        }*/
        /*Scanner s = new Scanner(System.in);
        String filename=s.next();
        int branch = s.nextInt();*/
        String filename = "resources5.txt";
        int branch=1;
        if (branch == 1) {
            branchMovement.branch1(keywordString,filename);
        }
        else if(branch ==2){
            branchMovement.branch2(filename);
        }
        else if(branch == 3){
            branchMovement.branch3(filename);
        }
        else if(branch == 4){
            branchMovement.branch4(filename);
        }
}
    }

