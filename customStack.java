import java.util.*;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isfull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty Stack!!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot peek from an empty Stack!!");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length - 1; // ptr is at last index
    }

    private boolean isEmpty(){
        return ptr == - 1; // ptr is at last index
    }
}
