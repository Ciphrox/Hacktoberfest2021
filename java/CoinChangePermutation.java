
package recursion;

import static recursion.CoinChange.coinchange;


public class CoinChangePermutation {
static int count=1;
    public static void coinchange(int denom[],int amount,String ans){
        
        if(amount==0){
            System.out.println(count+"->"+ans);
            count++;
            return;
        }
        
        for(int i=0;i<denom.length;i++){
        
            if(amount>=denom[i]){
                coinchange(denom,amount-denom[i],ans+denom[i]);
            }
    }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int denom[]={2,3,5,6};
        
        coinchange(denom,10,"");
    }
    
}
