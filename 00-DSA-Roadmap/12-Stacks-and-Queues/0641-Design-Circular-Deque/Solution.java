class MyCircularDeque {
    private final int[] data;
    private int front;
    private int size;

    public MyCircularDeque(int k) {
        data = new int[k];
        front = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        front = (front - 1 + data.length) % data.length;
        data[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % data.length;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : data[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;

        int rear = (front + size - 1) % data.length;
        return data[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}
