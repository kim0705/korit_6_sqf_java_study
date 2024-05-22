package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        //[일반 자료형]
        //1.논리
        boolean a = true;
        boolean b = false;

        //2.숫자(정수)
        int c = 1000000000;
        long d = 10000000000l; //자바에서 리터럴 자료형은 int형이기 때문에 long 타입을 쓸 경우 l을 써줘야함

        //3.숫자(실수)
        double e = 3.14;

        //4.문자
        char f = '가'; //AC00

        //5.문자열
        String g = "가나";
        System.out.println((int)f);
        System.out.println((char)((int)f + 1)); //형 변환

        //형 변환 문자 -> 정수 -> 실수

        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num; //다운캐스팅(명시적 형 변환)
        System.out.println(num2);
        double num3 = num2; //업캐스팅
        System.out.println(num3);

        System.out.println("==================================");
        int aa = 90;
        String bb = "90";

        String dd = (String)bb;
        System.out.println(aa + dd);

        int sum = 0;
        int i = 0;
        for(i = 0; i < 100 ; i++){
            sum += i;
        }
        System.out.println(i);

    }
}
