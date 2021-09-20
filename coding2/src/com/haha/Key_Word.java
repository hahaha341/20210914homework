package com.haha;

import java.io.IOException;
import java.util.Scanner;

public class Key_Word {

    public static void main(String[] args) throws IOException {
        String[] keywordString = {"auto", "break", "case",
                "char", "const", "continue", "default", "do", "double", "else",
                "enum", "extern", "float", "for", "goto", "if", "int",
                "long", "register", "return", "short", "signed",
                "sizeof", "static", "struct", "switch", "typedef", "union",
                "unsigned", "void", "volatile", "while"};
        Scanner s = new Scanner(System.in);
        String filename=s.next();
        int branch = s.nextInt();
        /*D:\\coding\\coding2\\resources5.txt"*/
        /*int branch;
        String filename = "resources5.txt";*/
        filename=processing.process(filename);


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

