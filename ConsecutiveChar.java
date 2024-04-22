import java.util.*;
public class ConsecutiveChar {

    static char maxPower(String s){
       int count = 1, max_count = 1;
       char prev = s.charAt(0);
       for (int i = 1; i<s.length(); i++){
          if(s.charAt(i) == prev){
              count++;
              max_count = Math.max(max_count,count);
          }
          else{
              count = 1;
              prev = s.charAt(i);
          }
       }
       return prev;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your string: ");
        String s = sc.next();
        System.out.println("the maximum occurring consecutive character substring is "+ maxPower(s));
    }

}
