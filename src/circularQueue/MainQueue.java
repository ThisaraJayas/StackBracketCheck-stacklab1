package circularQueue;

public class MainQueue {
    public static void main(String[] args){
        CQueue cq = new CQueue(5);

        cq.insert(4);
        cq.insert(4);
        cq.insert(4);
        cq.insert(4);
        cq.insert(4);
        cq.delete();
        cq.delete();
        cq.insert(4);
        cq.insert(4);
        cq.insert(4);

    }
}
