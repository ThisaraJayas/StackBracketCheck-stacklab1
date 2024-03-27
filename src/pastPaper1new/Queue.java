package pastPaper1new;

public class Queue {
    private int front;
    private int rear;
    private int maxSize;
    private char[] queArray;
    private int nItems;

    public Queue(int size){
        front=0;
        rear=-1;
        maxSize = size;
        queArray= new char[maxSize];
        nItems=0;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return nItems==maxSize;
    }
//    public void insert(char val){
//        if(!isFull()){
//            queArray[++rear]=val;
//            nItems++;
//        }else {
//            System.out.println("Queue is full");
//        }
//    }
    public void insert(char val){
        if(nItems==maxSize){
            System.out.println("Que is FUll");
        }else {
            if(rear==maxSize-1){
                rear=-1;
            }
            queArray[++rear]=val;
            nItems++;
        }
    }
//    public char delete(){
//        if(!isEmpty()){
//            nItems--;
//            return queArray[front++];
//        }else {
//            return 'N';
//        }
//    }
    public char delete(){
        if(nItems==0){
            return 'N';
        }else {
            char va = queArray[front++];
            if(front==maxSize){
                front=0;
            }
            nItems--;
            return va;
        }
    }
}
