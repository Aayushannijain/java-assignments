import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int s=0;
        int c=n;
        while(n > 0){
            int t= n%10;
            s = (s*10)+t;
            n=n/10;
        }
        if (s == c){
            System.out.println("the given number is palindrome");
        }
        else {
            System.out.println("the given number is not palindrome");
        }
    }
}
