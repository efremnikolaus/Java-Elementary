package Homework.QueueReentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class QueueReentrantLock<T> {

    private volatile int size = 0;
    private final Object[] content;
    private final int capacity;

    private int out;
    private int in;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition isEmpty = lock.newCondition();
    private final Condition isFull = lock.newCondition();

    QueueReentrantLock(int capacity) {
        try {
            lock.lock();
            this.capacity = capacity;
            content = new Object[capacity];
            out = 0;
            in = 0;
        }
        finally {
            lock.unlock();
        }
    }

    private int cycleInc() {
        int index = 0;
        return(++index == capacity)
                ? 0
                : index;
    }

    QueueReentrantLock<T> put(T value) throws InterruptedException {
        try {
            lock.lockInterruptibly();
            if (size == capacity) {
                while (size == capacity) {
                    isFull.await();
                }
            }
            if (size == 0) {
                content[in] = value;
            }
            else {
                in = cycleInc();
                content[in] = value;
            }
            size++;
            isEmpty.signal();
            }
            finally {
            lock.unlock();
            }
            return this;
    }
}
