package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;

    private StudentRepository() {
        names = new String[5];
    } // 생성되면 names배열 생성

    public static StudentRepository getInstance() {
        if(instance == null) {
            instance = new StudentRepository(); // istance에 StudentRepository객체 생성
        }
        return instance;
    }

    public void add(String name) { // StudentRepository객체가 생성이 되야 사용가능
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() { // names배열 리턴 메소드
        return names;
    }
}
