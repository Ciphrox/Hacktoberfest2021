import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s="aaaabc";
		Stack<Character> s1=new Stack<>();
		Stack<Character> s2=new Stack<>();
		int i=0;
		s1.push(s.charAt(0));
		while(i<s.length()){
		    if(!s2.isEmpty() && s2.peek()!=s1.peek()){
		        s1.push(s2.pop());
		    }
		    else if(s1.peek()!=s.charAt(i)){
		        s1.push(s.charAt(i));
		        i++;
		    }else{
		        s2.push(s.charAt(i));
		        i++;
		    }
		}
		while(!s2.isEmpty() && s1.peek() != s2.peek()){
		    s1.push(s2.pop());
		}
		StringBuilder sb=new StringBuilder();
		while(!s1.isEmpty()){
		    sb.append(s1.pop());
		}
		if(sb.length() != s.length()){
		    System.out.println("IMPOSSIBLE");
		}else{
		System.out.println(sb.reverse());
		}
	}
