package Lab8;

public class BoundedWaitList<E> extends WaitList<E> {
    public int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() < capacity) {
            content.add(element);
        }
    }
}
