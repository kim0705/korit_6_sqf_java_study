package com.study.java_study.ch03_함수;

public class FunctionTest02 {

    int getAddData(int a, int b){
        FunctionTest03 functionTest03 = new FunctionTest03();

        return functionTest03.add(a,b); // 여기서 만약 a,b값을 30, 40으로 받으면 return 값은 70으로 돌려줌
    }
}
