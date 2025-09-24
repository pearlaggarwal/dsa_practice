package Recursion2;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Tower of Hanoi solution for " + n + " disks:");
        Hanoi(n, 'A', 'B', 'C');
    }
    static void Hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
            return;
        }
        Hanoi(n - 1, A, C, B);
        System.out.println("Move disk " + n + " from " + A + " to " + C);
        Hanoi(n - 1, B, A, C);
    }
}
