package org.example;


public class Main {
    public static void main(String[] args) {
        Linked<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("abc");
        stringLinked.addFirst("fg");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
    }
}
