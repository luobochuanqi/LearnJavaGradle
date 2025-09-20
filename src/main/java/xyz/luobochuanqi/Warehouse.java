package xyz.luobochuanqi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;

public class Warehouse<T> {
    private final List<T> items = new ArrayList<>();
    // 此乃读写锁，允许多个读操作并发，但写操作是独占的
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(T item) {
        lock.writeLock().lock();
        try {
            items.add(item);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public Optional<T> remove(Predicate<T> condition) {
        lock.writeLock().lock();
        try {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                T item = it.next();
                if (condition.test(item)) {
                    it.remove();
                    return Optional.of(item);
                }
            }
            return Optional.empty();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public PageResult<T> query(Predicate<T> condition, int page, int size) {
        lock.readLock().lock();
        try {
            List<T> filtered = items.stream()
                    .filter(condition)
                    .toList();

            int total = filtered.size();
            int start = Math.min(page * size, total);
            int end = Math.min(start + size, total);

            List<T> content = filtered.subList(start, end);
            return new PageResult<>(content, total, page, size);
        } finally {
            lock.readLock().unlock();
        }
    }
}
