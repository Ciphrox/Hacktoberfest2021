class GfG
{
    public static Node reverse(Node head, int k)
    {
        ArrayList<Stack<Integer>> a = new ArrayList<>();
        Node node = head;
        while(node!=null)
        {
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<k && node!=null; i++)
            {
                st.push(node.data);
                node = node.next;
            }
            a.add(st);
        }
        node = head;
        for(int i=0; i<a.size(); i++)
        {
            while(!a.get(i).isEmpty())
            {
                node.data = a.get(i).pop();
                node = node.next;
            }
        }
        return head;
    }
}
