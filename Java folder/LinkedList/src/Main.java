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

    }

    public void insertFirst(){

    }

    public void deleteFirst(){

    }
}
public class Main{
    public static void main(){
        System.out.println();
    }
}