package HomeWork3.Exercize2;

import static HomeWork3.Exercize2.PhoneBook.*;

public class Main {
    public static void main(String[] args) {
        String number1 = "7987654321";
        String number2 = "986767564321";
        String name1 = "������";
        String name2 = "������";
        String name3 = "�������";

        add(name1, number1);
        add(name1, number2);
        add(name2, number1);
        add(name3, number2);
        add(name3, number1);
        add("������", "911");
        add("������", "911");
        get(name1);
        get(name2);
        get(name3);
        printPhoneBook(phoneBook);
    }
}
