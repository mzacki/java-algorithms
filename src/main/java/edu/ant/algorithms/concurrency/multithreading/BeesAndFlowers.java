package edu.ant.algorithms.concurrency.multithreading;

import edu.ant.utils.logger.LoggingService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Bees don't like to be disturbed at work and once the job on a flower is done, they mark it as pollinated / pollen
 * taken (using special pheromone). Hence usually we can see only one bee working on a single flower. Rarely, there is
 * more bee workers on larger and more aboundant inflorescence. Here we assume that only one bee can land on a flower at
 * the same time.
 */

public class BeesAndFlowers {

    private final AtomicLong flowers;
    private AtomicLong pollinated;
    private Map<String, Long> stats = new HashMap<>();

    public BeesAndFlowers(AtomicLong flowers) {
        this.flowers = flowers;
        this.pollinated = new AtomicLong(0L);
    }

    public void pollinateAllFlowers(String name) {
        for (int i = 0; i <= flowers.intValue(); i++) {
            sitOnFlower(name);
        }
    }

    private synchronized boolean sitOnFlower(String name) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pollinated.intValue() < flowers.intValue() ? pollinateFreeFlower(name) : logNoFlowersLeft();
    }

    private boolean pollinateFreeFlower(String name) {
        pollinated.getAndIncrement();
        report(name);
        LoggingService.logMessage(name + " is landing on the flower no." + pollinated);
        LoggingService.logMessage(flowers.intValue() - pollinated.intValue() + " free flowers left.");
        return true;
    }

    private void report(String name) {
        if (stats.containsKey(name)) {
            increase(name);
        } else {
            stats.put(name, 1L);
        }
        showResults();
    }

    private void increase(String name) {
        long done = stats.get(name);
        done++;
        stats.put(name, done);
    }

    private boolean logNoFlowersLeft(){
        LoggingService.logMessage("No free flowers left.");
        showResults();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void showResults() {
        stats.forEach((k, v) ->
                LoggingService.logMessage(k + ": " + v + " flowers"));
    }

}
