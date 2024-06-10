package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
                System.out.println("프로그램을 시작합니다.");
                System.out.println("프로그램을 종료합니다.");
            };

        runnable.run();
        System.out.println();

        Function<String, Integer> function = s -> Integer.parseInt(s);

        Integer num = function.apply("10");
        System.out.println("num: " + num);

        Integer num2 = function.andThen(result -> result * 2).apply("10");
        System.out.println("num2: " + num2);
        System.out.println();

        Consumer<String> consumer = s -> {
            System.out.println(s + "님이 접속하셨습니다.");
        };

        consumer.accept("김유진");
        System.out.println();

        Supplier<Integer> supplier = () -> {
            Integer result = num2 * 2;
            return result;
        };

        System.out.println("result: " + supplier.get());
        System.out.println();
    }
}
