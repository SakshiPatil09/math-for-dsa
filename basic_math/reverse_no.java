public class reverse_no {

    public static void main(String[] args) {
        int n = 5123;
        int rev =0;
        while (n!=0) {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        // for (;n !=0; n=n/10) {
        //     int rem = n%10;
        //     rev = rev*10+rem;
        // }
        System.out.println("reverse is " + rev);
    }
}
