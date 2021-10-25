package com.keylime.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> { // 이 T는 Comparable을 상속하는 자료형이어야 함.

    public List<T> sort(List<T> list) { // 입력 리스트를 받아서 출력으로 정렬된 리스트를 내보내준다.
        List<T> output = new ArrayList<>(list);
        // 입력 인자로 리스트를 받아서 그걸로 새 arrayList를 만들어서 output으로 넣음.
        // 입력과 출력을 메모리를 구분시켜 놓았음.(출력에 변화를 줘도 입력에 영향이 가지 않게)

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j));
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
