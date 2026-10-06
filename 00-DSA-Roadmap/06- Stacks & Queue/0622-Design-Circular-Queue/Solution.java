class MyCircularQueue {
    private final int[] data;
    private int front;
    private int size;

    public MyCircularQueue(int k) {
        data = new int[k];
        front = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        int rearIndex = (front + size) % data.length;
        data[rearIndex] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        front = (front + 1) % data.length;
        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : data[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;

        int rearIndex = (front + size - 1) % data.length;
        return data[rearIndex];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}
