package Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        Palindrome pl = new Palindrome(val);
        pl.isPalindrome();
    }
}
