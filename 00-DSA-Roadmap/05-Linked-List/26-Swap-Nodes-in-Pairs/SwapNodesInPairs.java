public class SwapNodesInPairs {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node swapPairs(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
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
        head.next.next.next = new Node(4);

        System.out.println("Before swapping:");
        printList(head);

        head = swapPairs(head);

        System.out.println("After swapping:");
        printList(head);
    }
}
