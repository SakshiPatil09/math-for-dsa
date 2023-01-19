import java.util.Scanner;

//An integer is considered a palindrome when it reads the same backward as forward
public class palindrome {
    static int reverse(int n){
        int rev =0;
        while (n!=0) {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("type a num : ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int rev1 = reverse(n);
        if (rev1 == n) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }
    }
}
