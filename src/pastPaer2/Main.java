package pastPaer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Queue que = new Queue(10);
        Stack st = new Stack(5);
        Stack tem = new Stack(5);

        Scanner sc = new Scanner(System.in);

        for(int i =0;i<5;i++){
            System.out.println("Enter Chars : ");
            char val = sc.next().charAt(0);
            st.push(val);
        }
        while (!st.isEmpty()){
            char val = st.pop();
            que.insert(val);
            tem.push(val);
        }

        while (!que.isFull()){
            char val= tem.pop();
            que.insert(val);
        }
        while (!que.isEmpty()){
            char val = que.delete();
            System.out.println(val);

        }

    }
}
