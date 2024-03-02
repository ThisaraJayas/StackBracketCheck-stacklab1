package QueueLab2;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        QueueX queue = new QueueX(5);


        Scanner sc = new Scanner(System.in);
        int num =1;
        for(int i=0;i<5;i++){
            System.out.println("Enter Transaction ID "+i+1+" : ");
            int value = sc.nextInt();
           queue.insert(value);
        }
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        while(!queue.isEmpty()){
            int val=queue.remove();
            if(val%2==0){
                evenQueue.insert(val);
            }else {
                oddQueue.insert(val);
            }
        }
        System.out.println("PC1");
        while (!evenQueue.isEmpty()){
            System.out.println("Transaction "+evenQueue);
        }
        System.out.println("PC2");
        while (!oddQueue.isEmpty()){
            System.out.println("Transaction "+oddQueue);
        }
    }
}
