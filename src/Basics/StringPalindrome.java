package Basics;

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
    Scanner sc = null;
    String str1 = null;
    // create object for scanner class
    sc = new Scanner(System.in);
    if (sc != null) {
        System.out.println("Enter First String");
        str1 = sc.nextLine();
    }
    strPalindrom(str1);
}// main

static void strPalindrom(String str) {
    // converting string into array
    char ch[] = str.toCharArray();
    // check string is Palindrom or not
    int count = ch.length - 1;
    for (int i = 0; i < ch.length; i++, count--) {
        if (ch[i] != ch[count]) {
            System.out.println("String is not Palindrom");
            break;
        } else {
            if (i == count) {
                System.out.println("String is Palindrom");
            }
        }
    } // for
}// strPalindrom method
}// class