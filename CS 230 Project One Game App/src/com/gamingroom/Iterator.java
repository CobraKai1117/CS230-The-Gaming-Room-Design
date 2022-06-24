package com.gamingroom;

public interface Iterator<E> // This is created so that iterators of specific collections can utilize their own methods for traversing through the collection. 
// This contains the iterator operations that will be overwritten by the specific iterators that will inherit from this one.
{
	void reset();  // Resets iterator to beginning
	E next(); // Shifts to next item
	E currentItem(); // Sets current item 
	boolean hasNext(); // Checks to see if there are additional items to be iterated over
}
