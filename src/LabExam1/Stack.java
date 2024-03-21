package LabExam1;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

    public Stack(int size){
        top=-1;
        maxSize=size;
        stackArray = new char[maxSize];
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(char n){
        if(!isFull()){
            stackArray[++top]=n;
        }else {
            System.out.println("Stack is Full");
        }

    }
    public char pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }else {
            return 'N';
        }
    }
}
