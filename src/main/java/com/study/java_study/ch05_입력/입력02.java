package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null; //next()
        int age = 0;        //nextInt()
        String address = null; //nextLine()
        String gender = null; //next()
        String phone = null; //nextLine()

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt(); // 엔터를 치게 되면 age에 값이 입력되고 아직 버퍼에는 엔터가 남아있음
        scanner.nextLine(); // 남아있는 엔터가 날라감

        System.out.print("주소: ");
        address = scanner.nextLine(); // nextLine()은 엔터의 입력도 받게됨

        System.out.print("성별: ");
        gender = scanner.next();
        scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine(); // return 타입이 String

        System.out.println();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);

        /*
        이름: 김준일
        나이: 31
        주소: 부산 동래구 중앙대로
        성별: 남
        연락처: 010-9988-1916
         */
    }
}
