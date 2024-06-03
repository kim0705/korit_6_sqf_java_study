package com.study.java_study.ch15_Static;

public class StudentService {
    private static StudentService instance; // static은 생성하지 않아도 쓸 수 있는 영역이므로
                                            // getInstance()에 instance를 쓸려면 instance도 static이어야함

    private StudentService() {} // 생성자에 private

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService(); // 자기 자신의 객체를 생성해서 자신에게 넣어둠
        }
        return instance; // 객체 리턴
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김준일");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
