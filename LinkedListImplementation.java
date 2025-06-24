public class LinkedListImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Linkedlist {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtStart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtMiddle(int data, int pos) {
            Node temp = new Node(data);
            Node t = head;
            if (pos == size()) {
                add(data);
                return;
            } else if (pos == 0) {
                insertAtStart(data);
                return;
            } else if (pos < 0 || pos > size()) {
                System.out.println("Index Out Of bound");
                return;
            }
            for (int i = 1; i <= pos - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;

        }

        int getElement(int pos) {
            Node l = head;
            for (int i = 0; i < pos; i++) {
                l = l.next;
            }
            return l.data;
        }

        void deleteAtIndex(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.add(1);
        ll.add(2);
        // ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        ll.display();
        System.out.println();
        // ll.size();
        ll.add(8);
        ll.display();
        System.out.println();
        // ll.size();
        ll.insertAtStart(0);
        ll.display();
        System.out.println();
        // ll.size();
        ll.insertAtMiddle(3, 3);
        ll.display();
        System.out.println();
        System.out.println(ll.getElement(1));
        ll.display();
        ll.deleteAtIndex(4);
        System.out.println();
        ll.display();
    }

}
