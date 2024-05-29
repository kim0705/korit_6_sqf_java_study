package com.study.java_study.ch09_클래스04;

public class BookEntity { // 클래스 안에는 Entity : 대상(정보 집합체)(생성자랑 getter, setter 필수), Service : 기능
    private int bookId;
    private String bookname;
    private String author;
    private String publisher;

    public BookEntity() {
    }

    public BookEntity(int bookId, String bookname, String author, String publisher) {
        this.bookId = bookId;
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() { // 정보 출력
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
