public class SplitOddEvenLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        // creating a linked list
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

        // creating temp node to point the original linkedlist
        Node temp = a;

        // creating even and odd linkedlist with a extra nodes
        Node A = new Node(100); // even
        Node B = new Node(100); // odd

        // creating temp nodes to point the even and odd linkedlist
        Node temp1 = A;
        Node temp2 = B;

        while (temp != null) {
            if (temp.data % 2 == 0) {

                // creating a new node with same value as original linkedlist to add in the even
                // linkedlist
                Node newNode = new Node(temp.data);

                // new node ko even ll me add kiya hai
                temp1.next = newNode;

                // even ll ke pointer ko aage bdhaya hai
                temp1 = temp1.next;

                // original ll ke pointer ko aage bdhaya hai
                temp = temp.next;
            } else {

                // creating a new node with same value as original linkedlist to add in the odd
                // linkedlist

                Node newNode = new Node(temp.data);

                // new node ko even ll me add kiya hai

                temp2.next = newNode;

                // even ll ke pointer ko aage bdhaya hai

                temp2 = temp2.next;

                // original ll ke pointer ko aage bdhaya hai

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
