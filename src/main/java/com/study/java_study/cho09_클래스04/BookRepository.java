package com.study.java_study.cho09_클래스04;

// 저장소 -> CRUD
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository() { // BookRepository가 생성될 때 배열도 같이 생성하게 할려고
        books = new BookEntity[0]; // 배열은 공간을 줄이고 늘일 수 없음
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() { // 이 클래스 안에서만 사용하는 메소드이므로 private
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옯긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }

    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book객체를 대입한다.
        books[getLastIndex()] = book;
    }

    // 단건 조회(하나만 조회)
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book; // 도서의 객체 자체를 대입
                break;
            }
        }
        return findBook;
    }

    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        for(BookEntity book : books) {
            if(book.getBookname().equals(bookName)) { // 문자열 비교
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    private  int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

            switch (option) {
                case 1: // 통합검색
                    for (BookEntity book : books) {
                        if (book.getBookname().contains(searchText) // contains : 문자열이 포함되어 있는지
                                || book.getAuthor().contains(searchText)
                                || book.getPublisher().contains(searchText)) {
                            newArraySize++;
                        }
                    }
                        break;
                        case 2: // 도서명검색
                            for(BookEntity book : books) {
                                if (book.getBookname().contains(searchText)) {
                                    newArraySize++;
                                }
                            }
                            break;
                        case 3: // 저자명검색
                            for(BookEntity book : books) {
                                if (book.getAuthor().contains(searchText)) {
                                    newArraySize++;
                                }
                            }
                            break;
                        case 4: // 출판사검색
                            for(BookEntity book : books) {
                                if (book.getPublisher().contains(searchText)) {
                                    newArraySize++;
                                }
                            }
                    }
        return newArraySize;
    }

    // 다건 조회
    public BookEntity[] searchBook(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch (option) {
            case 1: // 통합검색
                for (BookEntity book : books) {
                    if (book.getBookname().contains(searchText) // contains : 문자열이 포함되어 있는지
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: // 도서명검색
                for (BookEntity book : books) {
                    if (book.getBookname().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks; // 전체 도서에서 해당 도서들만 새로운 배열에 담아서 return
    }
}

