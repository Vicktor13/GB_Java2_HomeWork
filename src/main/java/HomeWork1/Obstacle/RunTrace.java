package HomeWork1.Obstacle;

import HomeWork1.Interfaces.Obstacle;
import HomeWork1.Interfaces.Participant;

public class RunTrace implements Obstacle {
    private final int length;
    private final String name;

    public RunTrace(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean checkObstacle(Participant participant) {
        if (participant.run() >= length) {
            System.out.printf("%s преодолел беговую дорожку %s%n", participant.getName(),getName());
            return true;
        }
        return false;
    }
}
