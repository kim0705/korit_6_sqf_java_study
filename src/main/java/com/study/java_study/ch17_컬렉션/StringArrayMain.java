package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayMain {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray); // strArray배열을 List로 변환
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        String[] strArray2 = strList.toArray(new String[strList.size()]); // 리스트에서 배열로 변환

        // 리스트 값 조회
        System.out.println(strList); // strList가 변환 후에도 계속 있음을 확인할 수 있다

        // contains 포함 여부
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1, 2, 3, 4, 5); // 데이터 추가가 안됨. 고정된 데이터
        System.out.println(nums);

        // 제거
        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList);
        System.out.println(strList.remove("test2")); // 값으로 제거하면 true/false로 나옴
        System.out.println(strList.remove("test1"));
        System.out.println(strList);
        System.out.println(strList.remove(1)); // 1번 인덱스 제거 // 인덱스로 제거하면 값이 나옴
        System.out.println(strList);

        System.out.println();
        System.out.println(nums);
        List<Integer> num2 = List.of(1,3,5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3.removeAll(num2)); // num2에 있는 데이터가 num3에 있다면 true
        System.out.println(nums3);

        // 중간에 값 추가도 가능
        nums3.add(0, 9); // 0번 인덱스에 9 추가
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10); // 0번 인덱스에 10으로 수정
        System.out.println(nums3);
        nums3.addAll(List.of(1,2,3));
        System.out.println(nums3);

        // 반복
        for (int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i)); // list에서 get해라
        }
        System.out.println();

        for(Integer num : nums3) {
            System.out.println(num);
        }
        System.out.println();

        Iterator<Integer> ir = nums3.iterator();
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }
    }
}
