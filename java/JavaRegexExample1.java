
import java.util.*;
import java.lang.*;
import java.io.*;


class JavaRegexExample1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// this example shows the regex to use to break the 
		// following string by /* somenumber */ pattern
		String originalString = " abc /* 1 */ def /* 100 */ pqr";
		String regexToBreakString = "\\/\\* ([0-9])* \\*\\/";
		String[] stringParts = originalString.split(regexToBreakString);

		for( String part : stringParts){ 
			System.out.println(part);	
		}
	}
}
