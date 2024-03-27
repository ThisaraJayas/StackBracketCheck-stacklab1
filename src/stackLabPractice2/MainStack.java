package stackLabPractice2;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args){
//        Stack st=new Stack(5);
//        st.push('A');
//        st.push('B');
//        st.push('C');
//        st.push('D');
//        st.push('E');
//        st.push('F');
//
//        while (!st.isEmpty()){
//            System.out.println(st.pop());
//        }
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        BracketCheck bc = new BracketCheck(inp);
        bc.check();
    }
}
