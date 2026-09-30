public class InsertAtBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Inserts a new node at the beginning
    public static Node addFirst(Node head, int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

    // Prints the linked list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Existing list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before insertion:");
        printList(head);

        // Insert 5 at beginning
        head = addFirst(head, 5);

        System.out.println("After inserting 5 at beginning:");
        printList(head);
    }
}
