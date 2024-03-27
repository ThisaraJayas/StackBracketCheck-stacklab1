package circularQueue;

public class CQueue {
    private int rear;
    private int front;
    private int maxSize;
    private int[] queArr;
    private int nItem;

    public CQueue(int size){
        rear=-1;
        front=0;
        maxSize=size;
        queArr = new int[maxSize];
        nItem=0;
    }

    public boolean isEmpty(){
        return nItem==0;
    }
    public boolean isFull(){
        return nItem==maxSize;
    }

    public void insert(int val){
        if(nItem==maxSize){
            System.out.println("QUeue is Full");
        }else {
            if(rear==maxSize-1){
                rear=-1;
            }
            queArr[++rear]=val;
            nItem++;
        }
    }

    public int delete(){
        if(nItem==0){
            return -99;
        }else {
            int val = queArr[front];
            if(front==maxSize){
                front=0;
            }
            nItem--;
            front++;
            return front;
        }
    }
}
