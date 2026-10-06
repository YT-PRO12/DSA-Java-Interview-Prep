public class ReverseNodesInKGroup {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverseKGroup(Node head, int k) {

        Node temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

        Node prev = null;
        Node curr = head;

        for (int i = 0; i < k; i++) {

            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
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
        head.next.next.next.next = new Node(5);

        System.out.println("Before reversal:");
        printList(head);

        head = reverseKGroup(head, 2);

        System.out.println("After reversing in groups of 2:");
        printList(head);
    }
}
