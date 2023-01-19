import java.util.Scanner;

// Example 1:
// Input: num1 = 4, num2 = 8
// Output: 4
// Explanation: Since 4 is the greatest number which divides both num1 and num2.

public class gcdORhcf {
    public static void main(String[] args) {
        System.out.println("type two num : ");
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1,n2); i++) {
            if (n1 %i ==0 && n2 % i ==0) {
                gcd = i;
            }
        }
        System.out.println("gcd of nums is : " + gcd);
    }
}
