package com.homeworks;

import java.util.*;

public class Main {

    public static <E> boolean isPalindrome(Collection<E> input) {
        List<E> list = new LinkedList<>(input);
        Iterator<E> startIterator = list.iterator();
        ListIterator<E> endIterator = list.listIterator(list.size());

        for (int i = list.size() / 2; i > 0; i--) {
            if (!Objects.equals(startIterator.next(), endIterator.previous())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        LinkedList<Integer> test = new LinkedList<>();
        test.add(1); test.add(2); test.add(3); test.add(2); test.add(1);

        LinkedList<String> test2 = new LinkedList<>();
        test2.add("Level");

        boolean palindromeCheck = isPalindrome(test);
        System.out.println(palindromeCheck);
        System.out.println(isPalindrome(test2));

    }
}
