package baekjoon.explantaion.q_5397;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCnt = scanner.nextInt();  // 테스트 케이스 수 입력

        String[] testCaseArr = new String[testCaseCnt];
        for ( int i = 0; i < testCaseCnt; i++ ) { // 테스트 케이스 입력
            testCaseArr[i] = scanner.next();
        }

        for ( int i = 0; i < testCaseArr.length; i++ ) {
            String testCase = testCaseArr[i];
            LinkedList<String> password = new LinkedList<>();
            int cursorIdx = 0;
            for ( int j =0; j < testCase.length(); j++ ) {
                String character = testCase.substring(j, j+1);
                if ( character.equals("<") ) {
                    if ( cursorIdx > 0 ) {
                        cursorIdx -= 1;
                    }
                } else if ( character.equals(">") ) {
                    if ( cursorIdx < password.size() ) {
                        cursorIdx += 1;
                    }
                } else if ( character.equals("-") ) {
                    if ( !password.isEmpty() ) {
                        password.remove(cursorIdx -1);
                    }
                } else {
                    password.add(cursorIdx, character);
                    cursorIdx += 1;
                }
            }
            System.out.println(String.join("", password));
        }
    }
}
