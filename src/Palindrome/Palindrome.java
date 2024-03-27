package Palindrome;

import java.util.Scanner;

public class Palindrome {
    private String text;

    public Palindrome(String txt){
        text=txt;
    }

    public void isPalindrome(){
        int length = text.length();
        Stack st = new Stack(length);
        Queue qu = new Queue(length);

        for(int i=0;i<length/2;i++){
            st.push(text.charAt(i));
        }
        for(int i=(length+1)/2;i<length;i++){
            qu.insert(text.charAt(i));
        }

        boolean isPalindrome = true;
        while (!st.isEmpty() && !qu.isEmpty()){
            if(st.pop()!= qu.delete()){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
