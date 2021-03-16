import static java.lang.Math.abs;

public class DiamondProblem {

    public static void main(String[] args) {
        int n = 4;
        String s = "xy";



        // First loop to print first half of the diamond
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second loop to print first half of the diamond
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
