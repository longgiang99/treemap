package queue;

public class CircularQueue {
    Node front;
    private Node rear;

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;
    }

    public Integer deQueue() {
        if (front == null) {
            return null;
        } else {
            int value = front.value;
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            return value;
        }
    }


}