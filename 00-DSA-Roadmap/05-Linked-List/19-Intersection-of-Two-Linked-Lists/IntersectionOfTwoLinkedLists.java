public class IntersectionOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node getIntersection(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        Node common = new Node(30);
        common.next = new Node(40);

        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = common;

        Node headB = new Node(15);
        headB.next = common;

        Node intersection = getIntersection(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection node: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
