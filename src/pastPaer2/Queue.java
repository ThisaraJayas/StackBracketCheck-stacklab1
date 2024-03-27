package pastPaer2;

public class Queue {
    private int rear;
    private int front;
    private int maxSize;
    private char[] quArray;
    private int nItems;

    public Queue(int size){
        rear=-1;
        front=0;
        maxSize=size;
        quArray = new char[maxSize];
        nItems=0;
    }

    public boolean isFull(){
        return nItems==maxSize;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public void insert(char val){
        if(nItems==maxSize){
            System.out.println("Queue is Full");
        }else {
            if(rear==maxSize-1){
                rear=-1;
            }
            quArray[++rear]=val;
            nItems++;
        }
    }
    public char delete(){
        if(nItems==0){
            return 'N';
        }else {
            char val = quArray[front++];
            if(front==maxSize){
                front=0;
            }
            nItems--;
            return val;
        }
    }
}
