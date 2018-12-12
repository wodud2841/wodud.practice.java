package wodud.practice.java;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if ((1<N)&&(N<6)||(N%2==0)&&(N>21)&&(N<101)){
            System.out.println("Not Weird");
        }else if((5<N)&&(N<21)||(N<101)) {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
