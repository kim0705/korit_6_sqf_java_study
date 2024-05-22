package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "김유진", 25, "01093044062"); // 0으로 시작하면 문자열로

        Student st = new Student();
        st.studentCode = 1234;
        st.name = "김유진";
        st.age = 25;
        st.phone = "01093044062";
        fx.fx02(st);
        }
    }

