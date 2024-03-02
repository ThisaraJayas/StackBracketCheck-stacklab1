package QueueLab2;

public class QueueX {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public QueueX(int size){
        front =0;
        rear=-1;
        maxSize=size;
        queueArray = new int[maxSize];
        nItems=0;
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize-1);
    }
    public void insert(int j){
        if(!isFull()){
            queueArray[++rear]=j;
            nItems++;
        }else {
            System.out.println("Queue is Full");
        }
    }
    public int remove(){
        if(!isEmpty()){
            nItems--;
            return queueArray[front++];
        }else {
            return -99;
        }
    }
}
