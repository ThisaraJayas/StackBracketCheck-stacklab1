package stackLabPractice1;

import java.util.Scanner;

public class MainStact {
    public static void main(String[] args) {
//        Stack newStack = new Stack(5);
//        newStack.push('a');
//        newStack.push('b');
//        newStack.push('c');
//
//        while (!newStack.isEmpty()){
//            System.out.println(newStack.pop());
//        }

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        BracketCheck newBr = new BracketCheck(exp);
        newBr.check();
    }
}
