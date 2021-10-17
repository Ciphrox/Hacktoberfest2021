import java.util.Scanner;

public class Queue
{
    Node head, tail;
    int s=0;
    static class Node
    {
        long data;
        Node next;

        public Node(long data)
        {
            this.data = data;
        }
    }

    public void add(long data)
    {
        Node temp = new Node(data);
        if (head == null)
            head = temp;
        else
            tail.next = temp;
        tail = temp;
        s++;
    }

    public long remove()
    {
        long del = head.data;
        head = head.next;
        s--;
        return del;
    }

    public long peek()
    {
        return head.data;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public int size()
    {
        return this.s;
    }

    public static void main(String[] args)
    {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
            q.add(sc.nextLong());
        while (!q.isEmpty())
            System.out.print(q.remove() + " ");
        System.out.println();
    }
}
