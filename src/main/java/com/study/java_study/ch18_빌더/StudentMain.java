package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(1)
                .name("김유진")
                .age(25)
                .build();

        Student student2 = Student.builder()
                .studentCode(2)
                .name("홍길동")
                .age(35)
                .build();

        System.out.println(student);
        System.out.println(student2);
    }
}
