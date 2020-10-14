package baekjoon.explantaion.q_2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 카드 개 수
        int m = scanner.nextInt(); // 카드 3장의 최대 합
        int result = 0;

        System.out.println("N = " + n);
        System.out.println("M = " + m);

        int[] numArr = new int[n];
        for ( int i = 0; i < n; i++ ) { // 카드 입력
            numArr[i] = scanner.nextInt();
        }

        for ( int a = 0; a < n; a++ ) {
            for ( int b  = a + 1; b < n; b++ ) {
                for ( int c = b + 1; c < n; c++ ) {
                    int sum = numArr[a] + numArr[b] + numArr[c];
                    if ( sum <= m && sum >= result ) { // 합이 m을 넘지 않을 경우
                        result = sum;
                    }
                }
            }
        }

        System.out.println("result = " + result);
    }
}
