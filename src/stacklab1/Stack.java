package stacklab1;

public class Stack {
    private int top;
    private char[] stackArray;
    private int maxSize;

    public Stack(int s){
        top=-1;
        maxSize=s;
        stackArray=new char[maxSize];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }
    public void push(char j){
        if(!isFull()){
            stackArray[++top]=j;
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
    public int peek(){
        return stackArray[top];
    }
}
