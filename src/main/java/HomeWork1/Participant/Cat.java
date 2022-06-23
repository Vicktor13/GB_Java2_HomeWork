package HomeWork1.Participant;

import HomeWork1.Interfaces.Participant;

public class Cat implements Participant {
    private final int height;
    private final int length;
    private final String name;

    public Cat(String name, int height, int length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int run() {
        System.out.printf("%s пробежал %s м.%n", getName(), length);
        return length;
    }

    @Override
    public int jump() {
        System.out.printf("%s прыгнул на %s м.%n", getName(), height);
        return height;
    }
}
