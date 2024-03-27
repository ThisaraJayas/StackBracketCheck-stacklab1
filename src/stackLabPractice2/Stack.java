package stackLabPractice2;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArr;

    public Stack(int size){
        top=-1;
        maxSize=size;
        stackArr= new char[maxSize];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public void push(char v){
        if(!isFull()){
            stackArr[++top]=v;
        }else {
            System.out.println("Stack is Full");
        }
    }
    public char pop(){
        if(!isEmpty()){
            return stackArr[top--];
        }else {
            return 'N';
        }
    }
}
