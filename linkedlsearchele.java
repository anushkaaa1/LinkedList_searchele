//search an element
public class linkedlsearchele {
    Node head,tail;

    linkedlsearchele(){
        tail = head =null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head==null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null)
          System.out.println("list is empty");
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public int findele(int value){
        if(head==null){
            return 0;
        }
        else{
            Node temp = head;
            int i=1;
            while(temp!=null){
                if(temp.data==value){
                    break;
                }
                i++;
                temp = temp.next;
            }
            if(temp==null){
                return 0;
            }
            else{
                return i;
            }
        }
    }
    public static void main(String args[]){
        linkedlsearchele l = new linkedlsearchele();
        l.create(2);
        l.create(6);
        l.create(8);
        l.create(9);
        l.print(l.head);
        System.out.println();
        int ele;
        ele =  l.findele(2);
        if(ele==0){
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+ele+"position");
        }
    }

}
