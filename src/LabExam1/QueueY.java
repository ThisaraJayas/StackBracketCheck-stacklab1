package LabExam1;

public class QueueY {
    private int front;
    private int rear;
    private int maxSize;
    private char[] queArray;
    private int nItems;

    public QueueY(int size){
        maxSize=size;
        front=0;
        rear=-1;
        queArray=new char[maxSize];
        nItems=0;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return nItems==maxSize;
    }

    public void insert(char val){
        if(!isFull()){
            if(rear==maxSize-1){
                rear=-1;
            }
            queArray[++rear]=val;
            nItems++;

        }else {
            System.out.println("Queue is Full");
        }
    }
    public char delete(){
        if(!isEmpty()){
            if(front==maxSize){
                front=0;
            }
            char val = queArray[front++];
            nItems--;
            return val;

        }else {
            return 'N';
        }
    }
}
