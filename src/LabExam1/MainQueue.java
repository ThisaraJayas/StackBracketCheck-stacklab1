package LabExam1;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        QueueY que = new QueueY(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
//        String val = sc.nextLine();
//        int len = val.length();

//        for(int i=0;i<len;i++){
//        if
            while (!que.isFull()){
                char c = sc.next().charAt(0);
                que.insert(c);
            }
//        }

        Stack stack = new Stack(5);
        while (!que.isEmpty()){
            char lett = que.delete();
            stack.push(lett);
        }

        while (!stack.isEmpty()){
            char lett = stack.pop();
            que.insert(lett);
        }

        while (!que.isEmpty()){
            System.out.println(que.delete());
        }
    }

}
