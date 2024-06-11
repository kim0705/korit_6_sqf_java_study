package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>(); // ArrayList: 순서 있고 중복 o(배열 같은 느낌)

        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.println("도서명: ");
            bookName = scan.nextLine();
            System.out.println("저자명: ");
            author = scan.nextLine();

            bookList.add(new Book(bookName, author)); // 입력받은 데이터로 새로운 Book객체를 만들어서 bookList에 추가
        }

        for(Book book : bookList) {
            System.out.println("도서명: " + book.getBookName());
            System.out.println("저자명: " + book.getAuthor());
        }

        System.out.print("삭제할 도서명: ");
        String removeBookName = scan.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break;
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getBookName().equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보: " + removeBook);
                break;
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("도서명: " + bookList.get(i).getBookName());
            System.out.println("저자명: " + bookList.get(i).getAuthor());
        }

    }
}
