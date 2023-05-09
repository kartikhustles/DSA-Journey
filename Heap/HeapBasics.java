import java.util.ArrayList;

public class HeapBasics {
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {// O(logn)
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // updating the value
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(1);

        System.out.println(heap.peek());
    }
}
