package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        Button homeButton = new HomeButton();
        Button loginButton = new Button() { // 인터페이스는 생성 안됨. 익명클래스 생성(생성을 위해서 추상클래스나 인터페이스가 필요함(일반 클래스도 상속이 되면 다 가능))
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        };

        click(homeButton);
        click(loginButton);

    }

    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();
    }
}
