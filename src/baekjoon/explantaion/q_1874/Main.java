package baekjoon.explantaion.q_1874;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();         // 개수
        int[] numberArr = new int[n];   // 1~N 정수

        Stack<Integer> stack = new Stack<>();
        List<String> result = new ArrayList<>();

        for ( int i = 0; i < n; i++ ) { // 1~N 까지의 정수 입력
            numberArr[i] = scan.nextInt();
        }

        int count = 1;

        for ( int i = 0; i < n; i++ ) {
            while ( count <= numberArr[i] ) {
                stack.push(count);
                count++;
                result.add("+");
            }
            if ( stack.peek() == numberArr[i] ) {
                stack.pop();
                result.add("-");
            }
        }

        if ( stack.isEmpty() ) {
            for ( String op : result ) {
                System.out.println(op);
            }
        } else {
            System.out.println("NO");
        }
    }
}
