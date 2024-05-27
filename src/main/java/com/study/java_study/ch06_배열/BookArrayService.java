package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {

        String[] names = new String[0];
        Scanner scanner = new Scanner(System.in);
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        int findIndex = -1;
        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택: ");

            String selectNum = scanner.nextLine();
            String[] newNames = null;

            switch (selectNum) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String reName = scanner.nextLine();
                    findIndex = bookArrayUtils.findByName(names, reName);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 이름입니다.");
                        break;
                    }
                    System.out.println("이름 변경: ");
                    names[findIndex]= scanner.nextLine();
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    String delName = scanner.nextLine();
                    findIndex = bookArrayUtils.findByName(names, delName);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 이름입니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < names.length - 1; i++) {
                        if( i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println(delName + "을 삭제하셨습니다.");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("찾을 이름: ");
                    String findName = scanner.nextLine();
                    findIndex = bookArrayUtils.findByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 이름입니다.");
                        break;
                    }
                    System.out.println("등록되어 있는 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length ; i++) {
                        System.out.println(names[i]);
                    }
                    break;
                case "q":
                    System.out.println("[프로그램 종료]");
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}
