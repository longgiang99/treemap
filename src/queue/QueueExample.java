package queue;
public class QueueExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        CircularQueue queue = new CircularQueue();

        // thêm số vào mảng
        for (int number : numbers) {
            queue.enQueue(number);
        }

        // Print all numbers in the queue
        System.out.print("Numbers in the queue: ");
        Node current = queue.front;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != queue.front);
        System.out.println();

        // Dequeue and print the first number in the queue
        int firstNumber = queue.deQueue();
        System.out.println("First number in the queue: " + firstNumber);

        // Enqueue a new number into the queue
        int newNumber = 6;
        queue.enQueue(newNumber);
        System.out.println("New number enqueued: " + newNumber);

        // Print all numbers in the queue again
        System.out.print("Numbers in the queue: ");
        current = queue.front;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != queue.front);
        System.out.println();
    }
}