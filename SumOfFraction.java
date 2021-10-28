class SumOfFraction
{ 	
    static int gcd(int a, int b)
    {
    if (a == 0)
        return b;
    return gcd(b%a, a);
    }
    static void lowest(int den3, int num3)
{
    // Finding gcd of both terms
    int common_factor = gcd(num3,den3);
 
    // Converting both terms into simpler
    // terms by dividing them by common factor
    den3 = den3/common_factor;
    num3 = num3/common_factor;
    System.out.println(num3+"/"+den3);
}
    void addFraction(int num1, int den1, int num2, int den2)
    {
        int den3 = gcd(den1,den2);
 
    // Denominator of final fraction obtained
    // finding LCM of den1 and den2
    // LCM * GCD = a * b
    den3 = (den1*den2) / den3;
 
    // Changing the fractions to have same denominator
    // Numerator of the final fraction obtained
    int num3 = (num1)*(den3/den1) + (num2)*(den3/den2);
 
    // Calling function to convert final fraction
    // into it's simplest form
    lowest(den3,num3);	
    }
}
