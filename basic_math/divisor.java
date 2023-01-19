
public class divisor {
    static void printdivisor(int n){
        System.out.println("divisors are ");
        for(int i =1; i<=n;i++){
            if(n % i ==0){
                System.out.println(i +" ");
            }
        }
        
    }
    public static void main(String[] args) {
        int n = 23;
        printdivisor(n);
    }
}
