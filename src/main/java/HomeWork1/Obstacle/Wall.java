package HomeWork1.Obstacle;

import HomeWork1.Interfaces.Obstacle;
import HomeWork1.Interfaces.Participant;

public class Wall implements Obstacle {
    private final int height;
    private final String name;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean checkObstacle(Participant participant) {
        if (participant.jump() >= height){
            System.out.printf("%s преодолел стену %s%n",participant.getName(), getName());
            return true;
        }else {
            return false;
        }
    }
}
