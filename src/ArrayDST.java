public class ArrayDST {
    private int size;
    private int location;
    private int [] data;

    public ArrayDST() {
        this.size = 5;
        this.location = -1;
        this.data = new int[this.size];
    }
    public ArrayDST(int newSize) {
        this.size = newSize;
        this.location = -1;
        this.data = new int[this.size];
    }
    public boolean isEmpty() {
        return this.location == -1;
    }
    public boolean isFull() {
        return this.location == this.size - 1;
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
    }
    p
}
