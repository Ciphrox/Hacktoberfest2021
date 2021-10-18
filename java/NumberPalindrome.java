public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(125));
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number){

        int reverse=0;
        int num=number;

        while(num!=0)
        {
            int n = num % 10;
            reverse *= 10;
            reverse+=n;
            num/=10;
        }
        return reverse==number;
    }
}
