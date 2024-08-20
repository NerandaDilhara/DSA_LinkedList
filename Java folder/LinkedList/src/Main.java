class Link{
    public int iData;
    public Link next;

    public Link(int id){
        this.iData = id;
    }

    public void displayLink(){
        System.out.println("Data is : " + this.iData);
    }
}
class LinkedList{
    private Link first;

    public LinkedList(){
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void displayList(){
        Link current = this.first;

        while(current != null){
            current.displayLink();
            current = current.next;
        }

        System.out.println();
    }

    public void insertFirst(int item){
        Link newLink = new Link(item);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
}
public class Main{
    public static void main(){
        System.out.println();
    }
}