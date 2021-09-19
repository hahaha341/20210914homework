package com.haha1;

import com.haha.branchMovement;
import org.junit.Assert;
import org.junit.Test;
public class check5 {
    String[] keywordString = {"auto", "break", "case",
            "char", "const", "continue", "default", "do", "double", "else",
            "enum", "extern", "float", "for", "goto", "if", "int",
            "long", "register", "return", "short", "signed",
            "sizeof", "static", "struct", "switch", "typedef", "union",
            "unsigned", "void", "volatile", "while"};
    @Test
    public void testBranch1(){
        branchMovement c = new branchMovement();
        branchMovement.branch1(keywordString,"resources5.txt");
        Assert.assertEquals(35,branchMovement.count);
    }
}
