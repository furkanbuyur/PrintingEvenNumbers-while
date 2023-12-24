import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        int k,i = 1;
        System.out.print("Enter a number : ");
        k = inp.nextInt();

        while (k>=i){
            if (i % 2 == 0){
                System.out.println(i+",");
            } i++;
        }
    }
}