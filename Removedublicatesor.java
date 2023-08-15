import java.util.LinkedList;

// public class Removedublicatesor {
//     class Node{
//         int value;
//         Node next;

//     }
//     public void  Node( int value){
//         this.value=value;
//     }
//     public  void Node(int value,Node next){
//         this.value=value;
//         this.next=next;
        
//     }

//     public void insertFirst(Node val){
//         Node node=new Node(val);
//         node.next=head;
//         if(tail==null){
//             tail=head;
//         }

//     }

//     public void insertLast(int value){
//         if(tail==null){
//             insetFirst(value);
//             return;
//             Node node=new node();
//             tail.next=node;
//             tail=node;
//             size++;
//         }
//     }
//     public void display(){
//         Node temp =head;
//         while(temp!=null){
//             System.out.println(temp.value+"->");
//             temp=temp.next;
//         }
//         System.out.println("end");
//     }


//     public void deldublicate(){
//         Node node=head;
//         while(node.next!=null){
//             if(node.value==node.next.value){
//                 size--;
//                 return value;
//             }
//             else{
//                 node=node.next;
//             }
//             tail=node;
//             tail.next=null;
//         }
//     }



// class Main{
//     public static void main(String[] args) {
//         LinkedList<N> list=new LinkedList<Integer>();
//         list.insertLast(1);
//         list.insertLast(1);
//         list.insertLast(2);
//         list.insertLast(3);
//         list.insertLast(4);
//         list.insertLast(4);
//         list.display();
//         list.deldublicate();
//     }
    
// }
// }
public class Removedublicatesor {
Node head;
private int size;
Removedublicatesor(){
    size=0;
}


public class Node{
    int data;
    Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    // insetion from start
public void addFirst(int data){
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;

}
public void addLast(int data){
    Node newnNode=new Node(data);
    if(head ==null){
        head=newnNode;
        return;
    }

    Node lastNode=head;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
    }
    lastNode.next=newnNode;
}

public void printlist(){
    Node curnode=head;
    while(curnode!=null){
        System.out.println(curnode.data+"->");
        curnode=curnode.next;
    }
    System.out.println("null");
}
public void removeFirst(){
    if(head==null){
        System.out.println("empty list, nothig  to delete");
        return;
    }
    head=this.head.next;
    size--;

}
public void removeLast(){
    if(head==null){
        System.out.println("empty  list,nothing to delete ");
        return;

    }
    size--;
    if(head.next==null){
        return;

    }

    Node curNode=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        curNode=curNode.next;
        lastNode=lastNode.next;
    }

    curNode.next=null;

}

// public int getsize(){
//     return size;
// }

class Main{
public static void main (String args[]){
    Removedublicatesor list=new Removedublicatesor();
    //LinkedList<Integer> list=new LinkedList<Integer>(null);
    
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);
    list.addLast(2);
    list.addLast(9);
    list.printList();
   // list.addFirst(3);
   // list.printList();
    //System.out.println(list.getsize);





}
}

}


