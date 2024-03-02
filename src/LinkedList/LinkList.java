package LinkedList;

public class LinkList {
    public Link first;

    public LinkList(){
        first=null;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void displayList(){
        Link currrent = first;
        while (currrent!=null){
            currrent.displayDetails();
            currrent=currrent.next;
        }
    }

    public void insertFirst(String name, double avg){
        Link newLink = new Link(name,avg);
        newLink.next=first;
        first=newLink;
    }
    public Link deleteFirst(){
        Link temp = first;
        first=first.next;
        return temp;
    }
    public Link deleteLink(String name){
        Link current = first;
        Link previous = first;
        while (current!=null){
            if(current.name.equals(name)){
                if(current==first){
                    first=first.next;
                }else{
                    previous.next=current.next;
                }
                return current;
            }
            previous=current;
            current=current.next;
        }
        return null;
    }
}
