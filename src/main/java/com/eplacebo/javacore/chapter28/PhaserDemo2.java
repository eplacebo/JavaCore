package com.eplacebo.javacore.chapter28;

import java.util.concurrent.Phaser;


class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        this.numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Фаза " + p + " завершена.\n");

        if (p == numPhases || regParties == 0) return true;
        return false;
    }
}


class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new MyThread4(phsr, "A");
        new MyThread4(phsr, "B");
        new MyThread4(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}


class MyThread4 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread4(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        new Thread(this).start();
        phsr.register();
    }

    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

