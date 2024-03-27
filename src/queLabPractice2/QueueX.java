package queLabPractice2;

public class QueueX {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queArray;
    private int nItems;

    public QueueX(int size){
        front=0;
        rear=-1;
        maxSize = size;
        queArray = new int[maxSize];
        nItems=0;
    }

    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }

    public void insert(int v){
        if(!isFull()){
            queArray[++rear]=v;
            nItems++;
        }else {
            System.out.println("Que is Full");
        }
    }

    public int delete(){
        if(!isEmpty()){
            nItems--;
            return queArray[front++];
        }
        else {
            return -99;
        }
    }
}
