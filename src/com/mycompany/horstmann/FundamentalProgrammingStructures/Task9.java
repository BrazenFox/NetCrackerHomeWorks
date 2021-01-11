package com.mycompany.horstmann.FundamentalProgrammingStructures;

public class Task9 {
    private String str1 = "abcd";
    private String str2 = "a";
    private String str3 = "b";
    private String str4 = "c";
    private String str5 = "d";
    private String str;
    public void compareStrings() {str = str2.concat(str3).concat(str4).concat(str5);
        System.out.println("Compare with equals: " + str1.equals(str));
        System.out.println("Compare with ==: " + (str1 == str));
    }
}
