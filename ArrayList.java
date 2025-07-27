package datastructureshub;

/**
 * A simple dynamically‑resizing list of ints.
 * 
 * Internally backed by an int[] buffer that doubles in size when full.
 * Supports 0‑based indexed inserts, deletes, and traversal.
 */
public class ArrayList<T> {
    /** Number of elements currently stored (not the buffer capacity). */
    private int size;

    /** Backing array buffer; initial capacity = 10. */
    private Object [] elements = new Object[10];

    /**
     * Returns the number of stored elements.
     * @return current size (0 ≤ size ≤ capacity)
     */
    public int getSize() {
        return size;
    }

    /**
     * Inserts value at the given 0‑based index, shifting existing elements right.
     * Grows the buffer if it is full.
     *
     * @param index position to insert (0 = front, size = end)
     * @param val   value to insert
     * @return true if insertion succeeded; false if index is invalid
     */
    public boolean addAt(int index, T val) {
        // validate index in [0..size]
        if (index < 0 || index > size) {
            return false;
        }
        // grow buffer if full
        if (size == elements.length) {
            grow();
        }
        // shift elements [index..size-1] one slot to the right
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        // insert new value
        elements[index] = val;
        size++;
        return true;
    }

    /**
     * Inserts value at the front (index 0).
     * Time complexity: O(n) due to shifting.
     *
     * @param val value to insert
     * @return true if insertion succeeded
     */
    public boolean addFirst(T val) {
        return addAt(0, val);
    }

    /**
     * Appends value at the end.
     * Amortized O(1): may trigger a grow, but constant work otherwise.
     *
     * @param val value to append
     * @return true if insertion succeeded
     */
    public boolean addLast(T val) {
        return addAt(size, val);
    }

    /**
     * Deletes the element at the given index, shifting later elements left.
     *
     * @param index position to delete (0 = first, size-1 = last)
     * @return true if deletion succeeded; false if index is invalid
     */
    public boolean deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        // shift elements [index+1..size-1] left one slot
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        // clear old last slot (optional)
        elements[size - 1] = null;
        size--;
        return true;
    }

    /** Deletes the last element (at index size-1). */
    public boolean deleteLast() {
        return deleteByIndex(size - 1);
    }

    /** Deletes the first element (at index 0). */
    public boolean deleteFirst() {
        return deleteByIndex(0);
    }

    /**
     * Removes all occurrences of the given value.
     * Internally calls deleteByIndex for each match.
     *
     * @param val value to remove
     */
    public void deleteByValue(T val) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(val)) {
                deleteByIndex(i);
                i--;  // step back to re-check this index after shift
            }
        }
    }

    /**
     * Clears the list of all elements.
     * Resets size to 0; zeroes out used slots for cleanliness.
     */
    public void clear() {
        // Optionally zero out existing data
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Prints each stored element (from index 0 to size-1).
     */
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    /**
     * Doubles the capacity of the backing buffer.
     * Copies all existing elements into the new, larger array.
     */
    private void grow() {
        Object[] elements2 = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
        }
        elements = elements2;
    }
    
    public T get(int index){
        return (T)elements[index];
    }
}

