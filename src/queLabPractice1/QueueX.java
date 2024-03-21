package queLabPractice1;

public class QueueX {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queArray;
    private int nItems;

    public QueueX(int size){
        maxSize=size;
        front=0;
        rear=-1;
        nItems=0;
        queArray = new int[maxSize];
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public void insert(int val){
        if(!isFull()){
            queArray[++rear]=val;
            nItems++;
        }else {
            System.out.println("Full");
        }
    }
    public int delete(){
        if(!isEmpty()){
            nItems--;
            return queArray[front++];

        }else {
            return -99;
        }
    }
}
