package LinkedList;

public class LinkMain {
    public static void main(String[] args){
//        Link Nipuna = new Link("Nipuna",53.5);
//        Link Aravinda = new Link("Aravinda",78.0);
//        Link Prashani = new Link("Prashani",69.5);
//
//        Nipuna.next=Aravinda;
//        Aravinda.next=Prashani;
//        Prashani.next=null;

        LinkList linkList = new LinkList();
        linkList.insertFirst("Nipuna",53.5);
        linkList.insertFirst("Aravinda",78.0);
        linkList.insertFirst("Prashani",69.5);

    }
}
