package edu.ant.algorithms.concurrency;

import edu.ant.algorithms.utils.logger.LoggingService;

/**
 * Bees don't like to be disturbed at work and once the job on a flower is done,
 * they mark it as pollinated / pollen taken (using special pheromone).
 * Hence usually we can see only one bee working on a single flower.
 * Rarely, there is more bee workers on larger and more aboundant inflorescence.
 * Here we assume that only one bee can land on a flower at the same time.
 * */

public class BeesAndFlowers {

    private final long flowers;
    private long pollinated;

    public BeesAndFlowers(long flowers) {
        this.flowers = flowers;
        this.pollinated = 0;
    }

    public void pollinateAllFlowers(String name) {
        for (int i = 0; i <= flowers ; i++) {
            sitOnFlower(name);
        }
    }

    private synchronized boolean sitOnFlower(String name) {
        return pollinated < flowers ? pollinateFreeFlower(name) : logNoFlowersLeft();
    }

    private boolean pollinateFreeFlower(String name) {
        pollinated++;
        LoggingService.logMessage(name + " is landing on the flower no." + pollinated);
        LoggingService.logMessage(flowers - pollinated + " free flowers left.");
        return true;
    }

    private boolean logNoFlowersLeft() {
        LoggingService.logMessage("No free flowers left.");
        return false;
    }

}
