
import java.util.HashMap;

public class ListStack implements Stack {

    int size;
    Node top;

    public ListStack() {
        size = 0;
        top = null;
    }

    @Override
    public int size() {
        int size = 0;
        for (Node n = top; n != null; n = n.next) {
            size++;
        }
        return size;
    }

//    @Override
//    public boolean isEmpty() {
//        if (top == null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    @Override
    public void push(int e) throws StackOverflowException {
        Node temp = new Node(e, top);
//        temp.next = top; sameshit
        top = temp;
        size++;
    }

    @Override
    public int pop() throws StackUnderflowException {
        if (top == null) {
            throw new StackUnderflowException();
        }
        int temp = top.val;
        top = top.next;
        size--;
        return temp;
    }

    @Override
    public int peek() throws StackUnderflowException {
        if (top == null) {
            throw new StackUnderflowException();
        }
        return top.val;
    }

//    @Override
//    public String toString() {
////        Node temp = top ; 
//        if (top == null) {
//            return "Stack empty";
//        }
//        String s = "[ ";
//        Node cur = top;
//        for (; cur.next != null; cur = cur.next) {
//            s = s + cur.val + " ";
//        }
//        s = s + cur.val + " ]";
//        return s;
//
//    }
//    @Override
//    public int[] toArray() {
//        int[] a = new int[size];
//        int i = 0;
//        for (Node n = top; n != null; n = n.next) {
//            a[i] = n.val;
//            i++;
//        }
//        return a;
//    }
//    @Override
//    public int search(int e) {
//        int c = 0;
//        for (Node n = top; n != null; n = n.next) {
//            if (e == n.val) {
//                return c;
//            }
//            c++;
//        }
//        return -1;
//    }
    public void printList() {
        for (Node n = top; n != null; n = n.next) {
            System.out.print(n.val + " ");
        }
        System.out.println();
    }

    public void RandomOccurrence() {

        HashMap<Integer, Integer> occ = new HashMap<>();
        int n1 = 0;
        for (Node n = top; n != null; n = n.next) {
            n1 = n.val;
            int numc = 1;
            for (Node m = n.next; m != null; m = m.next) {
                if (n1 == m.val) {
                    numc++;
                    m.val = 0;
                }
            }
            occ.put(n1, numc);
            if (n1 != 0) {
                System.out.println(n1 + " occurred " + occ.get(n1) + " times");
            }
        }
//        System.out.println(occ.get(n1));
    }

}
