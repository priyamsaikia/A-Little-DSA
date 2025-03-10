package saikia.priyam.littlejava.implementations;

public class LittleStack {//LIFO -  insert/push at head, pop from head
    StackNode head;
    int size = 0;
    int errorCode = -1111;


    public Integer pop() {
        int pop = errorCode;
        if (head == null) {
            return pop;
        }
        size--;
        pop = head.data;
        StackNode next = head.next;
        head = next;
        return pop;
    }

    public void push(int data) {
        StackNode stackNode = new StackNode(data);
        size++;
        if (head == null) {
            head = stackNode;
            return;
        } else {
            StackNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = stackNode;
        }
    }

    private void read(StackNode stackNode) {
        if (stackNode == null) {
            return;
        }
        StackNode current = stackNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private Integer getSize() {
        return size;
    }

    public void callME(){
        LittleStack littleStack = new LittleStack();
        littleStack.push(1);
        littleStack.push(2);
        littleStack.push(3);
        littleStack.push(4);
        littleStack.push(5);
        System.out.println("*** Stack ***");
        littleStack.read(littleStack.head);
        System.out.println("Size = " + littleStack.getSize());
        System.out.println("Popping..." + littleStack.pop());
        System.out.println("Popping..." + littleStack.pop());
        System.out.println("*** Stack ***");
        littleStack.read(littleStack.head);
        System.out.println("Size = " + littleStack.getSize());
    }
    class StackNode {
        StackNode next;
        int data;

        public StackNode(int data) {
            this.data = data;
        }
    }
}
