public class Countoccurence {
    public static void main(String[] args) {
        int num = 36777;
        // intiale count will be 0
        int count = 0;

        while (num > 0){

            int rem = num % 10;
            if (rem == 7){
                count ++;
            }
            num /= 10; // num = num / 10
        }
        System.out.println("Count occure: " + count);
    }
}    
