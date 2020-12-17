package edu.ant.structures.collections.generic;

import edu.ant.utils.logger.LoggingService;

public class AbstractQueueImplMain {

    public static void main(String[] args) {

        AbstractQueueImpl<String> queue = new AbstractQueueImpl<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Last");

        // First in, first out (FIFO queue)
        LoggingService.logMessage(queue.toString());
        // takes first
        queue.poll();
        LoggingService.logMessage(queue.toString());

        // selects but element remains intact
        String s = queue.peek();
        LoggingService.logMessage(s);
        LoggingService.logMessage(queue.toString());

        // adds at the end
        queue.offer("Very last");
        LoggingService.logMessage(queue.toString());

        // takes out what is now first, leaves the rest
        queue.poll();
        LoggingService.logMessage(queue.toString());
    }

}
