package com.in28minutes.api.g;

public class TextBlocksRunner {
    public static void main(String[] args) {
        System.out.println("\"First line\"\nSecond line\nThird line");
        String str = """
                "Line 1"    
                Line 2   
                Line 3""";
        System.out.println(str);

        String textBlock = """
                Line 1: %s
                Line 2: %s
                Line 3: 
                Line 4: 
                """.formatted("Some value", "Some Other Value");
        System.out.print(textBlock);
    }
}
