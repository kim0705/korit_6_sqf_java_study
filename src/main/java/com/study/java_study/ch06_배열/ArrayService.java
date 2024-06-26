package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1]; //이름을 등록하게 되면 원래 배열의 크기에서 하나가 늘어남(배열의 사이즈는 변경할 수 없으므로 새로운 배열을 생성)
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine(); // 인덱스 넘버는 0부터 시작이니깐 전체 길이에서 -1
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String reName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, reName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다");
                        break;
                    }
                    System.out.println("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String rmName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, rmName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println(rmName + "을(를) 삭제하였습니다.");
                    break; // case에서 빠져나감
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break; // switch문 break
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
            System.out.println();
        }
    }
}

