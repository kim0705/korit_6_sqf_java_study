package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        /*
            next() 메소드 특징
            1. 공백과 줄바꿈(엔터)는 무시한다.
            2. 버퍼를 사용한다. (버퍼: 한번의 많은 데이터를 묶어서 처리할 수 있게 함, 모든 키보드 입력이 버퍼에 저장됨)
         */
        String a = scanner.next(); // 엔터로 버퍼의 끝을 정함
        System.out.println("에이: " + a);

        System.out.print("b: ");
        String b = scanner.nextLine();
        System.out.println("비: " + b);
    }
}
