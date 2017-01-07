package oik.designpatterns.singleton.threadsafe;

import org.junit.Test;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

@SuppressWarnings("Duplicates")
public class ChocolateBoilerTest {
    @Test
    public void cndLockBoilerTest() throws InterruptedException {
        final CountDownLatch START = new CountDownLatch(3);
        final ChocolateBoiler[] boiler = new ChocolateBoiler[2];

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                START.countDown();

                try {
                    START.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(new Date().getTime());
                boiler[0] = ChocolateBoiler.getInstance();
                boiler[0].fill();
                boiler[0].boil();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                START.countDown();

                try {
                    START.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(new Date().getTime());
                boiler[1] = ChocolateBoiler.getInstance();
            }
        });

        thread1.start();
        thread2.start();

        START.countDown();

        while (boiler[0] == null || boiler[1] == null) {
            Thread.sleep(100);
        }

        assertEquals(boiler[0], boiler[1]);

        thread1.interrupt();
        thread2.interrupt();
    }
}