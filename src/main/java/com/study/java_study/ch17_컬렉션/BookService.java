package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookService {

    // 싱글톤
    private static BookService instance;

    private BookService() {} // 생성자를 외부에서 만들지 못하게 함

    public static BookService getInstance() {
        if(instance == null) {
            instance = new BookService(); // 동적 할당인데 싱글톤에 위배되기 때문에 new BookService를 만들 수 있는 생성자를 외부에서 만들지 못하게함
        }
        return instance;
    }

    private List<Map<String, Object>> bookDB = List.of( // List안에 Map이 있는 구조
            Map.of(
                    "bookId", 1,
                    "bookName", "자바의 정석"

            ),
            Map.of(
                    "bookId", 2,
                    "bookName", "파이썬의 정석"
            ),
            Map.of(
                    "bookId", 3,
                    "bookName", "데이터베이스의 정석"
            )

    );

    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다.");
        run2();
    }

    public void run2() {
        System.out.println("도서 전체 정보 요청을 받았습니다.");
        List<BookEntity> bookEntities = run3(); // List타입 bookEntities에 run3()메소드의 리턴값(List타입임) 대입
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료", bookEntities); // 생성자를 통한 매개변수를 bookRequestDto에 담아줌
        run4(bookRequestDto); // 담아준 매개변수를 run4의 매개변수로 이용
    }

    public List<BookEntity> run3() {
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");

        List<BookEntity> bookEntities = new ArrayList<>(); // 값을 넣어주기 위한 ArrayList를 미리 만들어줌

        for(Map<String, Object> bookMap : bookDB) { // bookDB에서 하나씩 꺼내면 Map타입
            BookEntity bookEntity = new BookEntity( // bookEntity에 bookMap에 있는 bookId와 bookName을 넣어줌
                    (int)bookMap.get("bookId"),
                    (String) bookMap.get("bookName")
            );

            bookEntities.add(bookEntity); // 만들어둔 ArrayList인 bookEntities에 bookEntity를 넣어줌
        }

        return bookEntities;
    }

    public void run4(BookRequestDto bookRequestDto) {
        System.out.println("데이터 베이스의 정보를 요청한 클라이언트에게 응답합니다.");
        System.out.println("[ 응답 데이터 ]");
        System.out.println(bookRequestDto);
    }
}
