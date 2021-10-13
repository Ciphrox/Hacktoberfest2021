package Data_Structure;

public class Linked_List {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Linked_List sll = new Linked_List();
        sll.head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(10);
        ListNode sixth = new ListNode(12);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sll.display();
        System.out.println(sll.length());
    }
    public int length(){
        if(head==null)
           return 0;
        ListNode current = head;
        int i=0;
        while(current!=null){
            current = current.next;
            i++;
        }
        return i;
    }
    public void display(){
        ListNode current = head;
        while(current!= null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
