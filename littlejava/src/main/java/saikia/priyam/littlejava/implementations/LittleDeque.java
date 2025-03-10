package saikia.priyam.littlejava.implementations;

//Double Ended Queue
//this data-structure is a linkedList which can add and delete from both head and tail
public class LittleDeque {
    Node root;
    private int size = 0;

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }


    private void insertAtHead(int data) {
        size++;
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        } else {
            node.next = root;
            root = node;
        }
    }

    private void insertAtTail(int data) {
        size++;
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node c = root;
            while (c.next != null) {
                c = c.next;
            }
            c.next = node;
        }
    }

    private void removeFromHead() {
        if (root == null) {
            return;
        }
        int peek = root.data;
        System.out.println("Removing head..." + peek);
        size--;

        Node next = root.next;
        root = next;
    }

    private void removeFromTail() {
        if (root == null) {
            return;
        }
        size--;

        Node current = root;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        int peek = current.data;
        System.out.println("Removing tail..." + peek);

        prev.next = null;
//        root = prev;
    }

    private void read(Node node) {
        if (node == null) {
            return;
        }
        Node current = node;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private int getSize() {
        return size;
    }

    public void callME() {
        LittleDeque littleDeque = new LittleDeque();
        littleDeque.insertAtHead(1);
        littleDeque.insertAtHead(2);
        littleDeque.insertAtHead(3);
        littleDeque.insertAtHead(4);
        littleDeque.insertAtTail(0);
        littleDeque.insertAtTail(-1);
        System.out.println("*** Deque ***");
        littleDeque.read(littleDeque.root);
        littleDeque.removeFromHead();
        System.out.println("*** Deque ***");
        littleDeque.read(littleDeque.root);
        littleDeque.removeFromTail();
        System.out.println("*** Deque ***");
        littleDeque.read(littleDeque.root);
        System.out.println("Size = " + littleDeque.getSize());
        littleDeque.insertAtHead(5);
        littleDeque.insertAtHead(6);
        System.out.println("*** Deque ***");
        littleDeque.read(littleDeque.root);
        System.out.println("Size = " + littleDeque.getSize());
    }
}
