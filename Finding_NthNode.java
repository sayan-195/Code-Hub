//Finding Nth node from the end of LinkedList
//100->13->4->5->12->10
public class Finding_NthNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node NthNode(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100->13->4->5->12->10
        Node temp = NthNode(a, 3);
        System.out.println(temp.data);
    }
}
