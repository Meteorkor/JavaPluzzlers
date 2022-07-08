package com.meteor.javapluzzlers.q71_q80;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.jupiter.api.Test;

public class Q77 {

    @Test
    void wrong() throws InterruptedException {
        final Worker worker = new Worker();
        worker.start();

        Timer t = new Timer(true);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                worker.keepWorking();
            }
        }, 500);

        Thread.sleep(400);
        worker.quit();//join으로 대기하며 lock을 잡고 있어서
    }
}

class Worker extends Thread {
    private volatile boolean quittingTime = false;

    public void run() {
        while (!quittingTime) {
            pretendToWork();
        }
        System.out.println("Beer is Good");
    }

    private void pretendToWork() {
        try {
            System.out.println("pretendToWork");
            Thread.sleep(300);
        } catch (InterruptedException e) {}
    }

    //업무 종료 시간이며, 직원들이 일을 마치기를 기다린다 - 좋은 상사에 의해 호출된다.
    synchronized void quit() throws InterruptedException {
        quittingTime = true;
        join();
    }

    //업무 종료 시간을 없앤다 - 나쁜 상사가 호출한다.
    synchronized void keepWorking() {
        quittingTime = false;
    }

}