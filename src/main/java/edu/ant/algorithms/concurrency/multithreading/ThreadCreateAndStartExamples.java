package edu.ant.algorithms.concurrency.multithreading;

import edu.ant.utils.logger.LoggingService;

public class ThreadCreateAndStartExamples {

    public static void main(String[] args) {

        /** Thread object class - anonymous class overriding run() method.
         * Warning! It's common mistake to use run() method of Thread object
         * instead of start()!
         * */

        Thread thread = new Thread() {
            @Override
            public void run() {
                LoggingService.logMessage("Thread object as anonymous class....");
            }
        };
        thread.start();

        /**
         * Thread class object invoked as lambda
         * */

        Thread lambdaThread = new Thread(() -> LoggingService.logMessage("Thread object as lambda...."));
        lambdaThread.start();

        /**
         * By class extending Thread class...
         * */

        Thread subthread = new SubThread();
        subthread.start();

        /**
         * Anonymous class implementation of Runnable interface.
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                LoggingService.logMessage("Runnable....");
            }
        };
        runnable.run();

        /**
         * Lambda implementation of Runnable interface.
         * */

        Runnable runnableLambda = () -> LoggingService.logMessage("Runnable as lambda...");
        runnableLambda.run();

    }

    private static class SubThread extends Thread {

        @Override
        public void run() {
            LoggingService.logMessage("Custom class extends Thread class...");
        }
    }

}
