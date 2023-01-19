public class armstrong_no {
    static int asm(int n){
        int r; //used to isolate nos
        int temp = n;
        int sum =0;
        while(n!=0){
            r = n %10;
            n = n/10;
            sum = sum + r*r*r;
        }
        
        if (temp == sum) {
            System.out.println("its armstrong");
        }else{
            System.out.println("not a armstrong");
        }
        return sum;

    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(asm(n));
    }
}
