class QueueNode
{
	int data;
	QueueNode next;
	public QueueNode(int val)
	{
		data=val;
		next=null;
	}
}
class QueueUsingLinkedList
{
	QueueNode front;
	QueueNode rear;
	public QueueUsingLinkedList()
	{
		front=null;
		rear=null;
	}
	void enqueue(int val)
	{
		QueueNode node=new QueueNode(val);
		if(rear==null)
		{
			rear=node;
			front=rear;
		}
		else
		{
			rear.next=node;
			rear=node;
		}
	}
	void dequeue()
	{
		if(rear==null)
		{
			System.out.println("Queue is empty. Cannot dequeue any value.");
		}
		else
		{
			System.out.println("Element dequeued: "+front.data);
			front=front.next;
		}
		if(front==null)
			rear=null;
	}
	void show()
	{
		QueueNode n=front;
		System.out.print("Queue: ");
		while(n!=null)
		{
			System.out.print(n.data+"\t");
			n=n.next;
		}
		System.out.println();
	}
	void peek()
	{
		if(front==null)
			System.out.println("Queue is empty.");
		else
			System.out.println("Element at front: "+front.data);
	}
	public static void main(String args[])
	{
		QueueUsingLinkedList ob=new QueueUsingLinkedList();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(5);
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.show();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(5);
		ob.show();
		ob.peek();
	}
}
