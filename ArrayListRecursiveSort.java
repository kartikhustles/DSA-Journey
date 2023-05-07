import java.util.*;

class ArrayListRecursiveSort {

    // // We have given an array list, we have to sort the array in asscending order

    // public static void main(String[] args) {
    // ArrayList list = new ArrayList<>(
    // Arrays.asList(5, 1, 0, 2)
    // );
    // sort(list);
    // System.out.println(list);
    // }

    // public static ArrayList sort(ArrayList<Integer> arr) { // sort function
    // // Base Condition
    // if (arr.size() == 1) {
    // return arr;
    // }

    // //Hypothesis
    // int temp = arr.size() - 1;
    // arr.remove(arr.size()-1);
    // sort(arr);

    // insert(arr, temp);
    // return arr;
    // }

    // public static ArrayList insert(ArrayList<Integer> arr, int temp){
    // //Base Condition
    // if (arr.size() == 0 || temp >= arr.get(arr.size() - 1) ) {
    // arr.add(temp);
    // return arr;
    // }

    // // Hypothesis
    // int val = arr.get(arr.size() - 1);
    // arr.remove(arr.size() - 1);
    // insert(arr, temp);

    // // Induction
    // arr.add(val);
    // return arr;
    // }

    // Given a stack, sort it in asscending order

    // public static void main(String[] args) {
    // Stack<Integer> st = new Stack<>();
    // st.push(5);
    // st.push(1);
    // st.push(0);
    // st.push(2);

    // System.out.println("Stack before sorting:");
    // for (Integer s : st) {
    // System.out.print(s + " ");
    // }

    // System.out.println("\nStack after sorting:");
    // Stack<Integer> sorted = sortStack(st);
    // for (Integer i : sorted) {
    // System.out.print(i + " ");
    // }
    // }

    // // Actual work start's from here
    // public static Stack<Integer> sortStack(Stack<Integer> st) {
    // if (st.size() == 1)
    // return st; // Base Condition
    // // Hypothesis
    // int temp = st.pop(); // getting 2 out
    // sortStack(st); // sorting the stack from [5,1,0] -> [0,1,5]

    // return insertElementAtStack(st, temp);
    // }

    // public static Stack<Integer> insertElementAtStack(Stack<Integer> st, int
    // temp) {
    // // Base Condition
    // if (st.size() == 0 || temp >= st.peek()) { // checking if let say we have 6
    // in temp & 6 is greater then 5
    // st.push(temp); // we will simply add it into our stack
    // return st;
    // }
    // // Hypothesis
    // int val = st.pop(); // getting 5 out stack becomes -> [0,1]
    // insertElementAtStack(st, temp); // insrting 2 to [0,1] which becomes ->
    // [0,1,2]
    // // Induction
    // st.push(val); // adding 5 to [0,1,2] which becomes -> [0,1,2,5]
    // return st;
    // }

    // // Delete Middle Element Of a Stack

    // public static void main(String[] args) {
    // Stack<Integer> st = new Stack<>();
    // st.push(5);
    // st.push(1);
    // st.push(0);
    // st.push(2);

    // Stack<Integer> sorted = midDel(st);
    // System.out.println(st);
    // }

    // public static Stack<Integer> midDel(Stack<Integer> st) {
    // // Base Condition
    // if (st.size() == 0)
    // return st;

    // // Hypothesis
    // int k = st.size() / 2 + 1; // calculating mid
    // return solve(st, k);
    // }

    // public static Stack<Integer> solve(Stack<Integer> st, int k) {
    // // Base Condition
    // if (st.size() == 1) {
    // st.pop();
    // return st;
    // }

    // // Hypothesis
    // int temp = st.pop(); // removing 5 from stack
    // solve(st, k - 1);

    // // Induction
    // return st.push(temp);
    // }

    // Reverse A Stack

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(0);
        st.push(2);

        Stack<Integer> reverse = reverse(st);
        System.out.println(reverse);
    }

    public static Stack<Integer> reverse(Stack<Integer> st) {
        // Base Condition
        if (st.size() == 1)
            return st;

        // Hypothesis
        int temp = st.pop(); // removing 5 from stack
        reverse(st); // reversing the stack
        return insert(st, temp);
    }

    public static Stack<Integer> insert(Stack<Integer> st, int temp) {
        // Base Condition
        if (st.size() == 0) {
            st.push(temp);
            return st;
        }

        // Hypothesis
        int val = st.pop(); // removing 1 from stack
        insert(st, temp); // inserting 5 to stack;

        // Induction
        st.push(val); // inserting 1 to stack
        return st;
    }
}
