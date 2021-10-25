package com.keylime.javaoop;

import com.keylime.javaoop.logic.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort<String> sort = new BubbleSort<>(); // 인스턴스를 만들어서 넣어줌

        System.out.println("[result] " + sort.sort(Arrays.asList(args))); // 입력인자를 사용
    }
}
