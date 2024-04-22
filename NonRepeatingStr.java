import java.util.*;
public class NonRepeatingStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your string: ");
        String str = sc.next();
        int[]freq = new int[256];

        for (int i =0; i< str.length(); i++){
            freq[str.charAt(i)]++;
        }
        System.out.println("the non repeating characters are: ");
        for (int i=0; i<256; i++){
            if (freq[i]==1){
                System.out.println((char)i + " ");
            }
        }
    }
}
