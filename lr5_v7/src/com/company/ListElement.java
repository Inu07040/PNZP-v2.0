package com.company;

public class ListElement {
    private final String value;
    private ListElement next;
    public ListElement(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public ListElement getNext() {
        return next;
    }
    public void setNext(ListElement next) {
        this.next = next;
    }
}
