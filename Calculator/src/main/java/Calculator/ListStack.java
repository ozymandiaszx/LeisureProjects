package Calculator;

public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }

    @Override
    public int size() {
        int size = 0 ;
        for(Node n = top ; n != null ; n=n.next){
            size++ ;
        }
        return size ;
    }

    @Override
    public boolean isEmpty() {
        if(top == null) return true ;
        else {
            return false ;
        }   
    }

    public void push(double e) throws StackOverflowException {
        Node temp = new Node(e, top);
//        temp.next = top; sameshit
        top = temp ;
        size++;
    }

    @Override
    public double pop() throws StackUnderflowException {
        if (top == null) {
            throw new StackUnderflowException();
        }
        double temp = top.val;
        top = top.next;
        size--;
        return temp;
    }

    @Override
    public int peek() throws StackUnderflowException {
        if(top == null){
            throw new StackUnderflowException() ;
        }
        return (int) top.val ;
    }
    
    @Override
    public String toString(){
//        Node temp = top ; 
        if(top == null) return "Stack empty" ; 
        String s = "[ " ; 
        Node cur = top ;
        for(; cur.next!=null ; cur=cur.next){
            s = s+ cur.val + " " ;
        }
        s = s + cur.val + " ]" ;
        return s ; 
        
    
    }
    
    
    @Override
    public int[] toArray() {
        int[] a = new int[size] ;
        int i = 0 ;
        for(Node n = top ; n != null ; n=n.next){
            a[i] = (int) n.val ;
            i++ ;
        }
        return a ; 
    }

    @Override
    public int search(int e) {
        int c = 0 ;
        for(Node n = top ; n != null ; n=n.next){
            if(e == n.val){
                return c ;
            }
            c++ ;
        }
        return -1 ;
    }
}