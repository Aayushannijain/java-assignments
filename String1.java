import javax.swing.*;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 strings: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        // to find and print words starting and ending with vowels
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            char f = word.charAt(0); // first character
            char l = word.charAt(word.length() - 1); // last character
            if (vowel(f) && vowel(l)){
                System.out.print(word+ " ");
            }

            /*if ((f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u' || f == 'A' || f == 'E' || f == 'I'
                    || f == 'O' || f == 'U') && (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I'
                    || l == 'O' || l == 'U')) {
                System.out.print(word + " "); //print the words
            }*/
        }

    }
        static boolean vowel(char c){
            c = Character.toUpperCase(c);
            if (c=='A' || c=='E'|| c=='I' || c=='O' || c=='U')
               return true;
            else
                return false;
        }

}
