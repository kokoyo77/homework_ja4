import java.util.LinkedList;

public class QueueUsingLinkedList {
    private LinkedList<Integer> queue;

    public QueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    public void enqueue(int element) {
        queue.addLast(element);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int first() {
        return queue.getFirst();
    }
}
