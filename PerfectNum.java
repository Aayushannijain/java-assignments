import java.util.*;
public class PerfectNum {
    static int checkPerfect(int n){
        int sum = 0;
        for (int i =1; i<= n/2; i++){
            if(n%i == 0) {
                sum = sum + i;
            }
        }
     return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int num = sc.nextInt();
        int s = checkPerfect(num);
        if (s == num){
            System.out.println("the input number is perfect!");
        }
        else{
            System.out.println("the input number is not perfect!");
        }
    }
}
