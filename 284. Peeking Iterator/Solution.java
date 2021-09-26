// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    // LinkedList<Integer> list = new LinkedList<>();
    Iterator<Integer> itr = null;
    Integer nextVal = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    // while(iterator.hasNext()) {
	    //     list.addLast(iterator.next());
	    // }
        itr = iterator;
        if(itr.hasNext()) {
            nextVal = itr.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        // return list.getFirst();
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    // return list.removeFirst();
        Integer val = nextVal;
        if(itr.hasNext()) {
            nextVal = itr.next();
        }else {
            nextVal = null;
        }
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    // return !list.isEmpty();
        return nextVal != null;
	}
}
