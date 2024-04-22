public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<= n; i++){
            for (int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int s=2; s<= i; s++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
