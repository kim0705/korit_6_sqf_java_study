package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ?

        Message<?> m1; // 와일드 카드는 Object인데 이걸 기호로'?'표시
        Message<String> m2 = null;

        m1 = new Message<>(10);
        String s = (String)m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // String클래스를 상속받거나 String클래스인 경우의 타입(하행)
        Message<? super String> m4 = new Message<>(new Object()); // String클래스의 위거나 String클래스인 경우의 타입(상행)

        String s2 = m3.getMessage();

    }
}
