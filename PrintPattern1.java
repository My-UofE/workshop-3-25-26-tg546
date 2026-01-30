import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your non negative number: ");
        int num = in.nextInt();

        for (int i = 0; i<= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            System.out.println("");
        }

    }
}