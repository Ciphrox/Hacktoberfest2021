package huffman;

import java.util.PriorityQueue;

public class huffmancode {
    public void makeHuff(char[] c,int[] a)
    {
        PriorityQueue<node> pq = new PriorityQueue<>((n1,n2)->{
            return n1.freq - n2.freq;
        });
        for(int i=0;i<c.length;i++)
        {
            pq.add(new node(c[i],a[i],null,null));
        }
        while(pq.size()>1)
        {
            node left = pq.poll();
            node right = pq.poll();
            pq.add(new node('#',left.freq+ right.freq,left,right));
        }
        printCode(pq.peek(),"");
    }

    private void printCode(node peek, String s) {
        if(peek==null)
            return;
        if(peek.c!='#')
            System.out.println(peek.c+": "+s);
        printCode(peek.left,s+"0");
        printCode(peek.right,s+"1");
    }
}
