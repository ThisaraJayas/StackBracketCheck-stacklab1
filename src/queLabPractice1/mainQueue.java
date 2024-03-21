package queLabPractice1;

import java.util.Scanner;

public class mainQueue {
    public static void main(String[] args){
        QueueX que = new QueueX(5);

        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            System.out.print("Enter Transaction ID "+(i+1)+" : ");
            int value = sc.nextInt();
            que.insert(value);
        }
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        while (!que.isEmpty()){
            int val = que.delete();
            if(val%2==0){
                evenQueue.insert(val);
            }else {
                oddQueue.insert(val);
            }
        }
        System.out.println("PC1");
        while (!evenQueue.isEmpty()){
            int even = evenQueue.delete();
            System.out.println("Transaction "+even);
        }
        System.out.println("PC2");
        while (!oddQueue.isEmpty()){
            int odd = oddQueue.delete();
            System.out.println("Transaction "+odd);
        }
    }
}
