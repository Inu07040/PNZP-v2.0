package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int N = sc.nextInt();
        System.out.println("Введите сами элементы: ");
        ListElement first = null;
        for (int i = 0; i < N; i++) {
            String value = sc.next();
            first = ListUtils.insert(first, value);
        }
        String result = ListUtils.reduce(ListUtils.filter(first));
        System.out.println(result);
    }
}
