package Palindrome;

public class Queue {
    private int front;
    private int rear;
    private int maxSize;
    private char[] quArr;
    private int nItems;

    public Queue(int size){
        front=0;
        rear=-1;
        maxSize=size;
        quArr=new char[maxSize];
        nItems=0;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public void insert(char val){
        if(!isFull()){
            quArr[++rear]=val;
            nItems++;
        }else {
            System.out.println("Queue is Full");
        }
    }
    public char delete(){
        if(!isEmpty()){
            return quArr[front++];
        }else {
            return 'N';
        }
    }
}
