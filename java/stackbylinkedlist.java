class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class MyStack{
    Node head;
    int sz;
    MyStack(){
        head=null;
        sz=0;
    }

    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }

    int pop(){
        if(head==null){return Integer.MAX_VALUE;}
        int res=head.data;
        Node temp=head;
        head=head.next;
        sz--;
        return res;
    }

    int peek(){
        if(head==null){return Integer.MAX_VALUE;}
        return head.data;
    }

    int size(){
        return sz;
    }

    boolean isEmpty(){
        return head==null;
    }
}

class vbd{

    public static void main (String[] args)
    {
        MyStack stack=new MyStack();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}