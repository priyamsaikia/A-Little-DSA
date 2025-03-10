package saikia.priyam.littlejava.implementations;

public class LittleQueue {//FIFO = insert at tail, pop from head
    int errorData = -1111;
    int size = 0;
    QueueNode head;


    class QueueNode {
        QueueNode next;
        int data;

        public QueueNode(int data) {
            this.data = data;
        }
    }

    public Integer pop() {
        int pop = errorData;
        if (head == null) {
            return pop;
        }
        size--;
        pop = head.data;
        QueueNode next = head.next;
        head = next;
        return pop;
    }

    public void push(int data) {
        QueueNode queueNode = new QueueNode(data);
        size++;
        if (head == null) {
            head = queueNode;
            return;
        } else {
            QueueNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = queueNode;
        }
    }

    private void read(QueueNode queueNode) {
        if (queueNode == null) {
            return;
        }
        QueueNode current = queueNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private Integer getSize() {
        return size;
    }

    public void callME() {
        LittleQueue littleQueue = new LittleQueue();
        littleQueue.push(1);
        littleQueue.push(2);
        littleQueue.push(3);
        littleQueue.push(4);
        littleQueue.push(5);
        System.out.println("*** Queue ***");
        littleQueue.read(littleQueue.head);
        System.out.println("Size = " + littleQueue.getSize());
        System.out.println("Popping..." + littleQueue.pop());
        System.out.println("*** Queue ***");
        littleQueue.read(littleQueue.head);
        System.out.println("Size = " + littleQueue.getSize());
    }
}
