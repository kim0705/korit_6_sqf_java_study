package com.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        Student[] student = new Student[5]; // null이 5개 들어있음
        student[0] = new Student(20240501, "김유진", 25);
        student[1] = new Student(20240502, "김유진", 26);
        student[2] = new Student(20240503, "김유진", 27);

        Student[] studentss = new Student[] {
                new Student(20240501, "김유진", 25),
                new Student(20240502, "김유진", 26),
                new Student(20240503, "김유진", 27)
        };

        String name = student[0].getName();
        System.out.println(student[0].getName());

        for(int i = 0; i < student.length; i++) {
            if(student[i] == null) { // NullPointerException오류 방지
                continue;
            }
            System.out.println("학번: " + student[i].getCode());
            System.out.println("이름: " + student[i].getAge());
            System.out.println("나이: " + student[i].getName());
            System.out.println();
        }
    }
}
