//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().


public class Task19 {
    private static int[] stackArray;
    private static int capacity;
    private static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        stackArray = new int[capacity];
        topIndex = -1;

        System.out.println(size());
        System.out.println(empty());
        push(563);
        push(56);
        push(456);
        push(258);
        push(987);
        System.out.println(size());
        System.out.println(empty());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(size());

    }

    public static int size() {
        return topIndex + 1;

    }

    public static boolean empty() {
        return topIndex == -1;

    }

    public static void push(int num) {
        stackArray[++topIndex] = num;

    }

    public static int peek() {
        return stackArray[topIndex];

    }

    public static int pop() {
        return stackArray[topIndex--];

    }
}
