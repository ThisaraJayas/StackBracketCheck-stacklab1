package queLabPractice2;

import java.util.Scanner;

public class MainQue {
    public static void main(String[] args){
        QueueX qu = new QueueX(5);

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter Transaction ID "+(i+1)+" : ");
            int id = sc.nextInt();
            qu.insert(id);
        }

        QueueX evenQue = new QueueX(5);
        QueueX oddQue = new QueueX(5);

        while (!qu.isEmpty()){
            int val = qu.delete();
            if(val%2==0){
                evenQue.insert(val);
                System.out.println("ID "+val+" is Send to EvenQueue");
            }else {
                oddQue.insert(val);
                System.out.println("ID "+val+" is Send to OddQueue");
            }
        }
        System.out.println("PC1");
        while (!evenQue.isEmpty()){
            int val = evenQue.delete();
            System.out.println("Transaction is "+val);
        }

        System.out.println("PC2");
        while (!oddQue.isEmpty()){
            int val = oddQue.delete();
            System.out.println("Transaction is "+val);
        }
    }
}
