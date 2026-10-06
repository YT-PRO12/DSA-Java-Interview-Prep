public class FlattenMultilevelLinkedList {

    static class Node {
        int data;
        Node next;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node next = curr.next;

                Node childHead = flatten(curr.child);

                curr.next = childHead;
                curr.child = null;

                Node tail = childHead;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = next;
            }

            curr = curr.next;
        }

        return head;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.next.child = new Node(4);
        head.next.child.next = new Node(5);

        System.out.println("Flattened list:");

        head = flatten(head);

        printList(head);
    }
}
