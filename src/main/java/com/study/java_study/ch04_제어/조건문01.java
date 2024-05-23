package com.study.java_study.ch04_제어;

public class 조건문01 {
    public static void main(String[] args) {
        // 1. if, else if, else // 조건에 따라 명령이 실행되야 하는 경우 (조건에 따라 값이 나와야 하면 삼항 연산자), 가독성도 생각해서 판단
        // 2. switch, case, default
        // 3. continue, break

        if(true) {
            System.out.println("참입니다.");
        } else {
            System.out.println("거짓입니다.");
        }

        int num = 10;
        if(num % 2 == 0 && num % 10 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if(num % 2 == 0) System.out.println("2의 배수입니다."); // 명령어가 하나면 중괄호를 생략해도 됨

        if(num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else if(num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if(num % 7 == 0) {
            System.out.println("7의 배수입니다.");
        } else {
            System.out.println("2의 배수도 아니고 3의 배수도 아니고 7의 배수도 아닙니다.");
        }
    }
}

