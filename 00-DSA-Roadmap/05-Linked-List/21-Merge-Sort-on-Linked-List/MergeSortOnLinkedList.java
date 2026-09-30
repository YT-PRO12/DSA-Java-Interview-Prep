public class MergeSortOnLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(secondHalf);

        return merge(left, right);
    }

    public static Node merge(Node left, Node right) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        temp.next = (left != null) ? left : right;

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

        Node head = new Node(50);
        head.next = new Node(10);
        head.next.next = new Node(40);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);

        System.out.println("Before merge sort:");
        printList(head);

        head = mergeSort(head);

        System.out.println("After merge sort:");
        printList(head);
    }
}
