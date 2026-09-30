public class SearchInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int search(Node head, int key) {

        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data == key) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;

        System.out.println("List: 10 -> 20 -> 30 -> 40 -> null");
        System.out.println("Key: " + key);
        System.out.println("Index: " + search(head, key));
    }
}
