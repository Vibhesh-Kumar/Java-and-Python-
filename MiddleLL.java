import java.util.LinkedList;
import java.util.List;

//import javax.sql.rowset.spi.SyncResolver;

public class MiddleLL {
Node head;
static class Node{
    int data;
    Node next;
    
    public  Node(int data){
        this.data =data;
            this.next= null;

        }
    }

    /* Function to print middle of linked list */
    void middleLL(){
        Node slowptr=head;
        Node fastptr=head;
        
        while(fastptr!=null && fastptr.next !=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
       // System.out.println(slowptr.data);
    }

    public void push(int  newdata){
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;

    
    }

        void printlist(){
        
            Node ptnode=head;
            while(ptnode!=null){
                System.out.println(ptnode.data+"->");
                ptnode=ptnode.next;
            }
            System.out.println("null");
    
        }


        public static  void main (String args[]){
        
        //LinkedList<Integer> llist=new LinkedList<>();
        MiddleLL llist=new MiddleLL();

            for(int i=5;i>0;--i){
             //   llist.printlist();
           // llist.push();
                llist.middleLL();  
                llist.MidddleLL.push();
                llist.printlist();
            }    
    }
}


    

