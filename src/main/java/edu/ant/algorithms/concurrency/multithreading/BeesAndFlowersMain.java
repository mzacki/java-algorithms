package edu.ant.algorithms.concurrency.multithreading;

import java.util.concurrent.atomic.AtomicLong;

public class BeesAndFlowersMain {


    public static void main(String[] args) {
        beeAndFlowerExecutor();
    }

    private static void beeAndFlowerExecutor() {

        BeesAndFlowers beesAndFlowers = new BeesAndFlowers(new AtomicLong(125));

        Thread beeThread1 = new Thread(() -> beesAndFlowers.pollinateAllFlowers("Bee no. 1"));
        Thread beeThread2 = new Thread(() -> beesAndFlowers.pollinateAllFlowers("Bee no. 2"));
        Thread beeThread3 = new Thread(() -> beesAndFlowers.pollinateAllFlowers("Bee no. 3"));
        Thread beeThread4 = new Thread(() -> beesAndFlowers.pollinateAllFlowers("Bee no. 4"));

        beeThread1.start();
        beeThread2.start();
        beeThread3.start();
        beeThread4.start();

    }

}
