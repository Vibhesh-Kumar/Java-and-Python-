import java.util.LinkedList;

import org.w3c.dom.Node;

public class DeleteLL {
  // Node head;
//     static class Node{
//         Node head;
//         /* Link list Node */
//     class Node {
//         int data;
//         Node next;
//     }

//     // Deletes middle node and returns
//     // head of the modified list

//         }
//     }

    

//     static void  deletemidll(Node head){
//         if(head==null){
//             return null;
//         }
//         if( head.next==null){
//             return null;
//         }
//         Node slow=head;
//         Node fast=head;
//         Node pre=null;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             pre=slow;
//             fast=fast.next.next;

//             // deletion of mid 
//             pre.next=slow.next;
//             return head;
//         }

//     }

//  // A utility function to print 
// // a given linked list
//     static void printlist(Node ptr){
//         while(ptr!=null){
//             System.out.println(ptr.data +"->");
//             ptr=ptr.next;
//         }
//         }

//         // Utility function to create a new node.
//         Node newNode(int data){
//             Node temp= new Node();
//             temp.data=data;
//             temp.next=null;
//             return temp;
//         }

//     public static void main(String args[]){
//     Node head = newNode(1);
//         head.next = newNode(2);
//         head.next.next = newNode(3);
//         head.next.next.next = newNode(4);

//         System.out.println("Given Linked List");
//         printList(head);

//         head = deleteMid(head);
    
//         System.out.println("Linked List after deletion of middle");
//         printList(head);
        
//     }

static class Node {
    int data;
    Node next;
    }

    // Deletes middle node and returns
    // head of the modified list
    static Node deleteMid(Node head)
    {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }

        // Initialize slow and fast pointers 
        // to reach middle of linked list
        Node slow_ptr = head;
        Node fast_ptr = head;

        // Find the middle and previous of middle.
        Node prev = null;

        // To store previous of slow_ptr
        while (fast_ptr != null 
&& fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }

        // Delete the middle node
    prev.next = slow_ptr.next;

        return head;
    }

    // A utility function to print 
// a given linked list
    static void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    // Utility function to create a new node.
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        System.out.println("Given Linked List");
        printList(head);

        head = deleteMid(head);

        System.out.println("Linked List after deletion of middle");
        printList(head);
    }
}

    

