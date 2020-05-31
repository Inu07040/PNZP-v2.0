package com.company;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class ListUtils {
    static ListElement element = null;
    static String v = "";

    public static ListElement insert(ListElement first, String value) {
        if (first == null) {
            return new ListElement(value);
        } else {
            ListElement element = first;
            while (element.getNext() != null)
                element = element.getNext();
            element.setNext(new ListElement(value));
            return first;
        }
    }

    public static boolean isNumeric(String str) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

    public static ListElement filter(ListElement first) {
        if (first != null) {
            v = first.getValue();
            if (isNumeric(v)) element = insert(element, v);
            filter(first.getNext());
        }
        return element;
    }

    public static String reduce(ListElement first) {
        String sum = "";
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }


}