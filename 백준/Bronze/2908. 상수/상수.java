import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        
        for(int i = 0; i < 2; i++) {
            String str = sc.next();
            
            String reversed = new StringBuilder(str).reverse().toString();
            
            int num = Integer.parseInt(reversed);
            
            if(num > max) max = num;
        }
        
        System.out.println(max);
        sc.close();
    }
}