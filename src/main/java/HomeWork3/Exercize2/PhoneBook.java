package HomeWork3.Exercize2;

import java.util.*;

public class PhoneBook {
    static Map<String, Set<String>> phoneBook = new HashMap<>(100);

    public static void printPhoneBook(Map<String, Set<String>> phoneBook) {
        phoneBook.forEach((name,numbers) ->
                System.out.printf("%s - %s%n", name, numbers));
    }

    public static void add(String name, String number) {
        Set<String> set;
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        set = phoneBook.get(name);
        set.add(number);
    }
    public static void get(String name){
        System.out.printf("%s - %s%n", name, phoneBook.get(name));
        }

    }

