import java.util.List;

public class Main{
    public static void main(String[] args) {
        LLbyKK list = new LLbyKK();
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertAtLast(10);
        list.insertAfter(4, 6);
        list.insertAfter(10, 11);
        list.display();
        // list.deleteFirst();
        // list.display();
        list.deleteLast();
        list.display();
        list.displayReverse();
        // System.out.println(list.deletePar(6));
        // list.display();
        // list.displayReverse();
        // System.out.println(list.deletePar(5));
        // list.display();
        // list.displayReverse();
        // System.out.println(list.deletePar(10));
        // list.display();
        // list.displayReverse();

        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // list.displayInBoth();
        
        // list.displayReverse();
        // list.displayInBoth();
    }
}