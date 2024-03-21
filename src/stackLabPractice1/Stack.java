package stackLabPractice1;

public class Stack {
    private int top;
    private char[] stArray;
    private int maxSize;

    public Stack(int size){
        top=-1;
        maxSize = size;
        stArray = new char[maxSize];
    }
    public boolean isFull(){
        return top==maxSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public void push(char val){
        if(!isFull()){
            stArray[++top]=val;
        }else {
            System.out.println("Stack is Full");
        }
    }
    public char pop(){
        if(!isEmpty()){
            return stArray[top--];
        }else {
            return 'N';
        }
    }
}
