import java.io.*;
import java.util.*;

public class Main {

 public static String compression1(String str){
  // write your code here
  String s="";
  for (int i=0; i   char c=str.charAt(i);
   s+=c;
   i++;
   while( i   i++;
   }
  }

  return s;
 }

 public static String compression2(String str){
  // write your code here
  String s="";
  for (int i=0; i   char c=str.charAt(i);
   s+=c;
   i++;
   int j=1;
   while( i   i++;
   j++;
   }
   if(j>1)
   s+=j;
  }

  return s;
 }
 public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  String str = scn.next();
  System.out.println(compression1(str));
  System.out.println(compression2(str));
 }

}
