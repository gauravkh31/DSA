public class SplitOddEvenLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);
        Node f = new Node(17);
        Node g = new Node(18);
        Node h = new Node(19);
        Node i = new Node(20);
        Node j = new Node(21);
        
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g; 
        g.next = h;
        h.next = i;
        i.next = j; 
        j.next = null;


        Node temp = a;


        Node A = new Node(100); // even
        Node B = new Node(100); // odd
        Node temp1 = A;
        Node temp2 = B;
        while(temp!=null){
            if(temp.data %2 == 0){
                Node newNode = new Node(temp.data);
                temp1.next = newNode;
                temp1 = temp1.next;
                temp = temp.next;
            }else{
                Node newNode = new Node(temp.data);
                temp2.next = newNode;
                temp2 = temp2.next;
                temp = temp.next;

            }
        }
        display(a);
        System.out.println();
        display(A.next);
        System.out.println();
        display(B.next);
        
    }
    
}
