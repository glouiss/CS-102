/** A class to represent an array data structure. */
public class ArrayDST {
    private int size;
    private int location;
    private int[] data;

    /**
     * Constructor for an array data Structure
     */
    public ArrayDST() {
        this.size = 5;
        this.location = -1;
        this.data = new int[this.size];
    }

    /**
     * Default constructor for an array data Structure
     */
    public ArrayDST(int newSize) {
        this.size = newSize;
        this.location = -1;
        this.data = new int[this.size];
    }

    /**
     * Check if the array is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.location == -1;
    }

    public boolean isFull() {
        return this.location == this.size - 1;
    }

    public int getCount() {
        return this.location + 1;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        String s = "count: " + this.getCount() +", size: " + this.size +
                ", Location: " + this.location+  ", data: [";
        if (this.isEmpty()) {
            s += "]";
        } else {
            for (int i = 0; i < this.location; i++) {
                s += this.data[i] + ", ";
            }
            s += this.data[this.location] + "]";
        }
        return s;
    }

    public boolean add(int element) {
        if (this.isFull()) {
            return false;
        } else {
            this.location++;
            this.data[this.location] = element;
            return true;
        }
    }

    public int find(int element) {
        if (this.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i <= this.location; i++) {
                if (this.data[i] == element) {
                    return i;
                }
            }
        }
        return -1;

    }

}
