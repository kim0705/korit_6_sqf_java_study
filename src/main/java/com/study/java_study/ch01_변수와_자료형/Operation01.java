package com.study.java_study.ch01_변수와_자료형;


public class Operation01 {
    public static void main(String[] args) {
        //연산자

        //산술 연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0; // 2의 배수인지 확인(홀,짝 판별)

        System.out.println("============================");
        //증감 연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        System.out.println("============================");
        //논리 연산자
        //true => 1
        //false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(!(true && true));

        System.out.println("============================");
        //관계 연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        System.out.println("============================");
        //조건 연산자
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수 입니다." : "y의 배수가 아닙니다.";
        System.out.println(result);
        String result2 = "" + 10 / 2 ;
        System.out.println(result2);

        System.out.println("============================");
        //복합 대입 연산자
        int number = 10;
        number += 5;
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;
        System.out.println(number);

        }
    }

