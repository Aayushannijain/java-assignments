import java.util.*;
public class MaxRepeatingStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your string: ");
        String str = sc.next();
        int []freq = new int[256];
         for (int i=0; i< str.length(); i++){
             freq[str.charAt (i)]++;
         }
         int max = -1;
         char c = ' ';
         for (int i=0; i< str.length(); i++) {
             if (max < freq[str.charAt(i)]) {
                 max = freq[str.charAt(i)];
                 c = str.charAt(i);
             }
         }
             System.out.println("maximum occurring character is: "+ c);

    }
}
