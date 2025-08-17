class Test{
    public static void main(String args[]){
       //sum of first n terms = n/2[2a + (n-1)d]
        //series = -21, -18, -15, -12 ....   find 28th term
        int a1 = -21; //first term
        int a2 = -18; //second term
        int d = a2-a1; //common diff
        int n = 28;
        int sumOfNTerms  = (n/2)*(2*a1 + (n-1) * d);
        System.out.println(sumOfNTerms);
    }
}