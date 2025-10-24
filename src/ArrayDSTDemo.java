public class ArrayDSTDemo {
    public static void main(String[] args) {
        ArrayDST array = new ArrayDST(6);
        array.display();

        System.out.println("array.isEmpty(): " + array.isEmpty());
        System.out.println("array.isFull(): " + array.isFull());

        System.out.println(".........................................");

        for (int i = 0; i < 6; i++){
            int number = (int)(Math.random() * 100);
            testAddMethod(array, number);
        }
        testFindMethod(array, 10);

    }
    public static void testAddMethod(ArrayDST array, int element){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("array.add(" + element + "): " + array.add(element));
        array.display();
        System.out.println("array.isEmpty(): " + array.isEmpty());
        System.out.println("array.isFull(): " + array.isFull());

        System.out.println(".........................................");
    }
    public static void testFindMethod(ArrayDST array, int element){
        System.out.println("array.find(" + element + "): " + array.find(element));
        array.display();
        System.out.println("array.isEmpty(): " + array.isEmpty());
        System.out.println("array.isFull(): " + array.isFull());

        System.out.println(".........................................");

    }
}
