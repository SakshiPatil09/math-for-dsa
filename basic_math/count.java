//count no of digits
public class count{
    public static int count_d(int n){
        int x = n;
        int counter=0;
        while(x!=0){
            x = x/10;
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println("no of digits : "+count_d(n));

        //converting int to string
        String s = Integer.toString(n);
        System.out.println(s.length());
        
    }
}