class QueueArray
{
	int que[];
	int size;
	int front;
	int rear;
	public QueueArray(int s)
	{
		size=s;
		front=rear=-1;
		que=new int[size];
	}
	void enqueue(int val)
	{
		if(rear+1==size)
			System.out.println("OVERFLOW!");
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			que[rear]=val;
		}
		else
			que[++rear]=val;
	}
	void dequeue()
	{
		if(front==-1 && rear==-1)
			System.out.println("UNDERFLOW!");
		else if(front==rear)
		{
			System.out.println("Element removed: "+que[front]);
			front=rear=-1;
		}
		else
			System.out.println("Element removed: "+que[front++]);
	}
	void show()
	{
		if(front==-1 && rear==-1)
			System.out.println("Queue is empty!");
		else
		{
			System.out.print("Elements in queue: ");
			for(int i=front;i<rear+1;i++)
				System.out.print(que[i]+"\t");
			System.out.println();
		}
	}
	void peek()
	{
		if(front==-1 && rear==-1)
			System.out.println("Queue is empty!");
		else
		{
			System.out.println("Element in front: "+que[front]);
		}
	}
	public static void main(String args[])
	{
		QueueArray ob=new QueueArray(5);
		ob.enqueue(2);
		ob.enqueue(5);
		ob.enqueue(-1);
		ob.show();
		ob.peek();
		ob.dequeue();
		ob.peek();
		ob.show();
	}
}
