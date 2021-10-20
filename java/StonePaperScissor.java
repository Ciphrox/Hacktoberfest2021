import java.util.*;
enum choice
{
	STONE(0,19),PAPER(20,39),SCISSOR(40,59);/*You may change these values. But keep in mind that :
	The greater the difference between the 1st and the 2nd value, the greater will be the probability of your computer choosing
	that particular option.
	Don't put a similar value at two different places.
	All natural numbers between 0 and 59 should be present in either of the
	three, no number should be left out.
	The first value of STONE and last value of SCISSOR should remain 0 and 59 respectively.
	For any Troubles, contact Mr_Magician*/
	int val,val2;
		int getVal()
		{
			return this.val;
		}
		int getVal2()
		{
			return this.val2;
		}
		choice (int val,int val2)
		{
			this.val=val;
			this.val2=val2;
		}
}
class SPS
{
	static int c=0,u=0;
	public static void main(String args[])
	{
		SPS aa = new SPS();
		Scanner ob = new Scanner(System.in);
		Random ab = new Random();
		while(true)
		{
			System.out.println("Type p for paper, s for stone, sc for scissor and q to quit and then press enter :");
			String s=ob.next();
			if(s.equals("q"))
			{
				System.out.println("Final result :");
				if(c>u)
					System.out.println("Computer won by "+(c-u)+" points!");
				else if(c<u)
					System.out.println("You won by "+(u-c)+" points!");
				else
					System.out.println("It was a tie!");
				break;
			}
			choice y=aa.userChoice(s);
			if(y==null)
				continue;
			System.out.println("User's choice : "+y);
			int a=ab.nextInt(59);
			choice x=aa.computerChoice(a);
			System.out.println("Computer's choice(totally random) : "+x);
			aa.result(x,y);
			System.out.println("Score: User="+u+" Computer="+c);
		}
		ob.close();
	}
	public choice computerChoice(int a)
	{
		if(a<choice.STONE.getVal2())
			return choice.STONE;
		else if(a<choice.PAPER.getVal2())
			return choice.PAPER;
		else if(a<choice.SCISSOR.getVal2())
			return choice.SCISSOR;
		return null;
	}
	public choice userChoice(String s)
	{
		if(s.equals("p"))
			s="PAPER";
		else if(s.equals("s"))
			s="STONE";
		else if (s.equals("sc"))
			s="SCISSOR";
		try
		{
			if(choice.valueOf(s)==choice.STONE)
				return choice.STONE;
			else if(choice.valueOf(s)==choice.PAPER)
				return choice.PAPER;
			else if(choice.valueOf(s)==choice.SCISSOR)
				return choice.SCISSOR;
		}
		catch(Exception e)
		{
			System.err.println("Wrong choice!");
		}
			return null;
	}
	void result(choice x, choice y)
	{
		switch(x)
		{
			case STONE:
				switch(y)
				{
					case STONE:System.out.println("It's a tie!");break;
					case PAPER:System.out.println("You win!");++u;break;
					case SCISSOR:System.out.println("You lost!");++c;break;
				}
				break;
			case PAPER:
				switch(y)
				{
					case STONE:System.out.println("You lost!");++c;break;
					case PAPER:System.out.println("It's a tie!");break;
					case SCISSOR:System.out.println("You won!");++u;break;
				}
				break;
			case SCISSOR:
				switch(y)
				{
					case STONE:System.out.println("You won!");++u;break;
					case PAPER:System.out.println("You lost!");++c;break;
					case SCISSOR:System.out.println("It's a tie!");++c;break;
				}
				break;
		}
	}
}
