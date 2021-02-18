package edu.ant.algorithms.data.structures.queue.recurring

import spock.lang.Specification

class RecurringQueueTest extends Specification {

    def item1
    def item2
    def item3
    def item4
    def item5
    def filledQueue
    def emptyQueue

    def setup() {
        item1 = new Item(1)
        item2 = new Item(2)
        item3 = new Item(3)
        item4 = new Item(4)
        item5 = new Item(5)
        item2.setRecurring(true)
        item5.setRecurring(true)
        filledQueue = new RecurringQueue([item1, item2, item3, item4] as Recurrable[])
        emptyQueue = new RecurringQueue()
    }


    def "should batch create queue and enqueue item"() {
        given:
        filledQueue
        when:
        def sizeBefore = filledQueue.size()
        def beforePeek = filledQueue.peek()
        def success = filledQueue.offer(item5)
        def sizeAfter = filledQueue.size()
        def afterPeek = filledQueue.peek()

        then:
        sizeBefore == 4
        beforePeek == item1
        success
        sizeAfter == 5
        afterPeek == item1
    }

    def "should return enqueued item"() {
        given:
        emptyQueue

        when:
        def beforeSize = emptyQueue.size()
        def beforePeek = emptyQueue.peek()
        emptyQueue.offer(item1)
        def afterSize = emptyQueue.size()
        def afterPeek = emptyQueue.peek()

        then:
        beforeSize == 0
        afterSize == 1
        beforePeek == null
        afterPeek == item1
    }

    def "should take out first item and leave empty queue"() {
        given:
        emptyQueue.offer(item1)

        when:
        def taken = emptyQueue.poll()

        then:
        taken == item1
        emptyQueue.size() == 0
    }

    def "should take out first item and leave empty queue - case 2"() {
        given:
        emptyQueue.offer(item1)
        emptyQueue.offer(item3)

        when:
        def taken = emptyQueue.poll()
        def taken2 = emptyQueue.poll()

        then:
        taken == item1
        taken2 == item3
        emptyQueue.size() == 0
    }

    def "should take out first item and leave empty queue - case 3"() {
        given:
        emptyQueue.offer(item1)
        emptyQueue.offer(item3)
        emptyQueue.offer(item4)

        when:
        def taken = emptyQueue.poll()
        def taken2 = emptyQueue.poll()
        def taken3 = emptyQueue.poll()

        then:
        taken == item1
        taken2 == item3
        taken3 == item4
        emptyQueue.size() == 0
    }

    def "should take out first item and enqueue it again"() {
        given:
        emptyQueue.offer(item2)

        when:
        def taken = emptyQueue.poll()

        then:
        taken == item2
        emptyQueue.size() == 1
        emptyQueue.peek() == item2
    }

    def "should take out first item and enqueue it again - case 2"() {
        given:
        emptyQueue.offer(item2)
        emptyQueue.offer(item5)

        when:
        def taken = emptyQueue.poll()
        def taken2 = emptyQueue.poll()

        then:
        taken == item2
        taken2 == item5
        emptyQueue.size() == 2
        emptyQueue.peek() == item2
    }

    def "should take out first item and enqueue it again - case 3"() {
        given:
        def item6 = new Item(6)
        item6.setRecurring(true)

        emptyQueue.offer(item2)
        emptyQueue.offer(item5)
        emptyQueue.offer(item6)

        when:
        def taken = emptyQueue.poll()
        def taken2 = emptyQueue.poll()
        def taken3 = emptyQueue.poll()

        then:
        taken == item2
        taken2 == item5
        taken3 == item6
        emptyQueue.size() == 3
        emptyQueue.peek() == item2
    }

}
