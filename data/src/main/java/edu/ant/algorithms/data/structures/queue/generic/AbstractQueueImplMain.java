package edu.ant.algorithms.data.structures.queue.generic;

import edu.ant.patterns.utils.logger.LoggingService;

public class AbstractQueueImplMain {

    public static void main(String[] args) {

        AbstractQueueImpl<String> queue = new AbstractQueueImpl<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Last");

        // First in, first out (FIFO queue)
        LoggingService.logMsg(queue.toString());
        // takes first
        queue.poll();
        LoggingService.logMsg(queue.toString());

        // selects but element remains intact
        String s = queue.peek();
        LoggingService.logMsg(s);
        LoggingService.logMsg(queue.toString());

        // adds at the end
        queue.offer("Very last");
        LoggingService.logMsg(queue.toString());

        // takes out what is now first, leaves the rest
        queue.poll();
        LoggingService.logMsg(queue.toString());
    }

}
