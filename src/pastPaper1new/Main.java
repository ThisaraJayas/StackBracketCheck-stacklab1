package pastPaper1new;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Queue qu = new Queue(5);
        Stack st = new Stack(5);

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter Character "+(i+1)+" : ");
            char val = sc.next().charAt(0);
            qu.insert(val);
        }
        while (!qu.isEmpty()){
            char val = qu.delete();
            st.push(val);
        }
        System.out.println("Push to Que Again");
        while (!st.isEmpty()){
            char val = st.pop();
            qu.insert(val);
        }
        System.out.println("Display Values");
        while (!qu.isEmpty()){
            char val = qu.delete();
            System.out.println(val);
        }


    }
}
