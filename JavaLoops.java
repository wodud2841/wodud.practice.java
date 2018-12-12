package wodud.practice.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println(N+" X "+i+" = "+N*i);
        }
        scanner.close();
    }
}
