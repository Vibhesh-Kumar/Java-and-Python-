//public class DeleteNode {
    class Node {
        public int data;
        public Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class  DeleteNode{//LinkedListOperations
        public static Node deleteNodes(Node head) {
            if (head == null) {
                return null;
            }
    
            Node current = head;
            while (current != null && current.next != null) {
                if (current.data < current.next.data) {
                    // Delete the current node by bypassing it.
                    current.next = current.next.next;
                } else {
                    // Move to the next node.
                    current = current.next;
                }
            }
    
        ///* return head;*/
        }
    */*/
        public static void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            // Custom input
            Node head = new Node(6);
            head.next = new Node(2);
            head.next.next = new Node(5);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(9);
            head.next.next.next.next.next = new Node(7);
            head.next.next.next.next.next.next = new Node(2);
            head.next.next.next.next.next.next.next = new Node(1);
            head.next.next.next.next.next.next.next.next = new Node(5);
            head.next.next.next.next.next.next.next.next.next = new Node(3);
    
            System.out.println("Original Linked List:");
            printList(head);
    
            Node modifiedHead = deleteNodes(head);
    
            System.out.println("Modified Linked List:");
            printList(modifiedHead);
        }
    }
//}
    

