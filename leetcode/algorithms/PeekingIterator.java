/*
 * Given an Iterator class interface with methods: next() 
 * and hasNext(), design and implement a PeekingIterator 
 * that support the peek() operation -- it essentially 
 * peek() at the element that will be returned by the next 
 * call to next().

 * Here is an example. Assume that the iterator is 
 * initialized to the beginning of the list: [1, 2, 3].
 * 
 * Call next() gets you 1, the first element in the list.
 * 
 * Now you call peek() and it returns 2, the next element. 
 * Calling next() after that still return 2.
 * 
 * You call next() the final time and it returns 3, 
 * the last element. Calling hasNext() after that should 
 * return false.
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
public class PeekingIterator implements Iterator<Integer> {

    private final Iterator<Integer> iterator;
    private Integer nextItem;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextItem;
    }

    @Override
    public Integer next() {
        Integer toReturn = nextItem;
        nextItem = null;
        return toReturn;
    }

    @Override
    public boolean hasNext() {
        if (nextItem != null)
            return true;
        if (iterator.hasNext())
            nextItem = iterator.next();
        return nextItem != null;
    }

}
