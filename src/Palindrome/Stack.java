package Palindrome;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stArr;

    public Stack(int size){
        top=-1;
        maxSize=size;
        stArr=new char[maxSize];
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(char v){
        if(!isFull()){
            stArr[++top]=v;
        }else {
            System.out.println("Stack is Full");
        }
    }
    public char pop(){
        if(!isEmpty()){
            return stArr[top--];
        }else {
            return 'N';
        }
    }
}
