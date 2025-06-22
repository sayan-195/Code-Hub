public class Display_Linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // 1 2 3 4 5
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // Link the Nodes
        a.next = b; // 1->2 3 4 5
        b.next = c; // 1->2->3 4 5
        c.next = d; // 1->2->3->4 5
        d.next = e; // 1->2->3->4->5
        e.next = f; // 1->2->3->4->5

        Node temp = a;
        for (int i = 1; temp != null; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
