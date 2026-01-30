import java.util.Scanner; // We use the Scanner class from java.util to handle user input
import java.util.ArrayList;

public class PrintPattern2 {
    public static void main(String[] args) {

        boolean valid = false;

        Scanner in = new Scanner(System.in);

        int size = -1;

        while (valid == false){
            System.out.println("Enter a size betweeen 1 and 5: ");

            size = in.nextInt();

            if (size < 1){
                System.out.println("too small!");
                valid = false;
            }
            if (size > 5){
                System.out.println("too big!");
                valid = false;
            }
            if (size >= 1 && size <= 5){
                valid = true;
            }
        }

        if (valid == true){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 1; i <= size; i++){
                numbers.add(i);
            }
            for (int i = 1; i <= size; i++){
                numbers.add(size-i+1);
            }

            for (int num: numbers){
                System.out.print(num);
            }
            System.out.println("");

            for (int j = 1; j< size; j++){
                for (int num: numbers){
                    System.out.print(num+j);
                }
                System.out.println("");
            }

                //ystem.out.println("");
            for (int z = 0; z < size; z++){
                for (int num: numbers){
                    System.out.print(num+(size-z-1));
                }
                System.out.println("");
            }
        }
    }
}
