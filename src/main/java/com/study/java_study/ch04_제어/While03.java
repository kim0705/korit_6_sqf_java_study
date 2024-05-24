package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("4. 회원 정보 수정");
            System.out.println("q. 프로그램 종료" );

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    boolean isRunMenu1 = true;
                    while(isRunMenu1) {
                        System.out.println("[회원 등록]");
                        System.out.println("1. 회원 이름 입력");
                        System.out.println("2. 회원 생년월일 입력");
                        System.out.println("3. 회원 비밀번호 입력");
                        System.out.println("b. 뒤로가기");

                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 이름을 입력해주세요.");
                                break;
                            case "2":
                                System.out.println("회원 생년월일을 입력해주세요.");
                                break;
                            case "3":
                                System.out.println("회원 비밀번호를 입력해주세요.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu1 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.print("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while(isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");

                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                isRun = false;
                                isRunMenu2 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "4":
                    System.out.println("회원 정보 수정으로 들어오셨습니다.");
                    boolean isRunMenu4 = true;
                    while (isRunMenu4) {
                        System.out.println("[회원 수정]");
                        System.out.println("1. 회원 닉네임 수정");
                        System.out.println("2. 회원 비밀번호 수정");
                        System.out.println("b. 뒤로가기");

                        System.out.print("메뉴선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 닉네임을 수정합니다.");
                                break;
                            case "2":
                                System.out.println("회원 비밀번호를 수정합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu4 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
