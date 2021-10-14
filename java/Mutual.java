public class Mutual {

    public static boolean isOdd(int n) 
    {
        if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n == 0) ? false : isEven(n-1);
    }

    public static boolean isEven(int n) 
    {
        if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n == 0) ? true : isOdd(n-1);
    }

    public static void main (String[] args){
      int n = 15;

        if (isEven(n)){ System.out.println(n + " is even");}
        else System.out.println(n + " is odd");
    }
}
