package com.study.java_study.ch17_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {

    Scanner scanner = new Scanner(System.in);

    List<Book> bookList = new ArrayList<>();

    for(int i = 0; i < 3; i++) {
        String bookname;
        String authorname;
        System.out.print("도서명: ");
        bookname = scanner.nextLine();
        System.out.print("작가명: ");
        authorname = scanner.nextLine();

        bookList.add(bookname, authorname);
    }

}
