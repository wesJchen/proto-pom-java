package com.test;

// Generate an svg file with a simple circle

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestExample {
    public static void main(String[] args) {
        String svgContent = "<svg width=\"100\" height=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                            "  <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"2\" fill=\"red\" />\n" +
                            "</svg>";

        try (PrintWriter out = new PrintWriter(new FileWriter("circle.svg"))) {
            out.println(svgContent);
            System.out.println("SVG file created successfully.");
        } catch (IOException e) {
            System.err.println("Error writing SVG file: " + e.getMessage());
        }


        int Replacer = TestExample.sum(1,3);
        System.out.println(Replacer);
    }

    public static int sum(int varA, int varB) {
        return varA + varB;
    }

    public static java.util.HashMap<String, Integer> product(int a, int b) {
        int prod = a * b;
        java.util.HashMap<String, Integer> resultMap = new java.util.HashMap<>();
        resultMap.put("product", prod);
        return resultMap;
    }
}