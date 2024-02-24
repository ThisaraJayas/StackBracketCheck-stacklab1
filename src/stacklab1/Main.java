package stacklab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Stack st1 = new Stack(4);
//        st1.push('A');
//        st1.push('S');
//        st1.push('M');
//        st1.push('O');
//
//        while (!st1.isEmpty()){
//            System.out.println(st1.pop());
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter An Expression");
        String expression = scanner.nextLine();

        BracketCheck bc = new BracketCheck(expression);
        bc.check();
    }
}
