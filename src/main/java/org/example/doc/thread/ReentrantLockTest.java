package org.example.doc.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lihaiming
 * @version 1.0.0
 * @since 2021/3/23 20:44
 **/
public class ReentrantLockTest {

    public Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
        new Thread(() -> {reentrantLockTest.test();}).start();
        new Thread(() -> {reentrantLockTest.test();}).start();
        new Thread(() -> {reentrantLockTest.test();}).start();
        new Thread(() -> {reentrantLockTest.test();}).start();
        new Thread(() -> {reentrantLockTest.test();}).start();
        System.out.println("线程启动成功");
    }
    public void test() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "获取到锁");
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放锁成功");
            lock.unlock();
        }
    }
}
