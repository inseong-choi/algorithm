package baekjoon.explantaion.q_2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberArr[] = new int[8];

        // 숫자 입력
        for ( int i = 0; i < numberArr.length; i++ ) {
            numberArr[i] = scanner.nextInt();
        }

        boolean isAsc = false;
        boolean isDesc = false;
        boolean isMixed = false;
        for ( int i = 0; i < numberArr.length - 1; i++ ) {
            if ( numberArr[i] >= 1 && numberArr[i] <= 8 ) { // 1~8사이 숫자만 입력
                if ( numberArr[i] == ( numberArr[i+1] - 1) ) { // 오름 차순
                    isAsc = true;
                } else if ( numberArr[i] > numberArr[i+1]
                        && (numberArr[i] - 1) == numberArr[i+1] ){ // 내림 차순
                    isDesc = true;
                } else {
                    isMixed = true;
                    break;
                }
            } else { // 1~8 사이 숫자가 아닐 경우 mixed
                isMixed = true;
                break;
            }
        }

        // 결과 출력
        if ( isMixed ) {
            System.out.println("mixed");
        } else {
            if ( isAsc ) {
                System.out.println("ascending");
            } else if ( isDesc ) {
                System.out.println("descending");
            }
        }
    }
}
