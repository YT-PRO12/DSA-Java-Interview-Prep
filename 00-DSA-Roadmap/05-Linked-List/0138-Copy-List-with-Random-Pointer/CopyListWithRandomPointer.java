public class CopyListWithRandomPointer {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {

            Node copy = new Node(curr.data);

            copy.next = curr.next;
            curr.next = copy;

            curr = copy.next;
        }

        curr = head;

        while (curr != null) {

            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }

        Node dummy = new Node(0);
        Node copyTail = dummy;

        curr = head;

        while (curr != null) {

            Node copy = curr.next;

            curr.next = copy.next;

            copyTail.next = copy;
            copyTail = copy;

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void printList(Node head) {

        while (head != null) {

            int randomValue =
                head.random == null ? -1 : head.random.data;

            System.out.println(
                "Node: " + head.data +
                ", Random: " + randomValue
            );

            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        first.random = third;
        second.random = first;
        third.random = second;

        Node copy = copyRandomList(first);

        System.out.println("Copied list:");
        printList(copy);
    }
}
