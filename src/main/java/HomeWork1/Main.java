package HomeWork1;

import HomeWork1.Interfaces.Obstacle;
import HomeWork1.Interfaces.Participant;
import HomeWork1.Obstacle.RunTrace;
import HomeWork1.Obstacle.Wall;
import HomeWork1.Participant.Cat;
import HomeWork1.Participant.Human;
import HomeWork1.Participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant human1 = new Human("Human1", 2, 30);
        Participant human2 = new Human("Human2",1, 50);
        Participant human3 = new Human("Human3",3, 30);
        Participant robot1 = new Robot("Robot1",3, 50);
        Participant robot2 = new Robot("Robot2",4, 70);
        Participant robot3 = new Robot("Robot3",1, 20);
        Participant cat1 = new Cat("Cat1",1, 20);
        Participant cat2 = new Cat("Cat2",2, 30);
        Participant cat3 = new Cat("Cat3",1, 30);

        Participant[] participants = new Participant[9];
        participants[0] = human1;
        participants[1] = human2;
        participants[2] = human3;
        participants[3] = robot1;
        participants[4] = robot2;
        participants[5] = robot3;
        participants[6] = cat1;
        participants[7] = cat2;
        participants[8] = cat3;

        Obstacle wall1 = new Wall("Wall1",1);
        Obstacle wall2 = new Wall("Wall2",2);
        Obstacle wall3 = new Wall("Wall3",3);
        Obstacle road1 = new RunTrace("RunTrace1",20);
        Obstacle road2 = new RunTrace("RunTrace2",30);
        Obstacle road3 = new RunTrace("RunTrace3",30);

        Obstacle[] obstacles = new Obstacle[6];
        obstacles[0] = wall1;
        obstacles[1] = wall2;
        obstacles[2] = wall3;
        obstacles[3] = road1;
        obstacles[4] = road2;
        obstacles[5] = road3;



//        Participant[] participants ={new Human ("Human1",2,10),new Robot("Robot1",3, 20),new Cat("Cat1",1,5)};
//        Obstacle[] obstacles = {new Wall("Wall1",2), new RunTrace("RunTrace1",20)};

//        RunTrace runTrace = new RunTrace(20);
//        Participant robot = new Robot(3,20);
//
//        runTrace.checkObstacle(robot);

        for (Participant participant : participants) {
            int count = 0;
            for (Obstacle obstacle: obstacles) {
                if (obstacle.checkObstacle(participant)) {
                    System.out.printf("%s преодолел %s%n", participant.getName(), obstacle.getName());

                    count++;
                } else {
                    System.out.printf("%s не преодолел %s и сошел с трассы%n%n%n", participant.getName(), obstacle.getName());
                    break;
                }
            }
            if (count == obstacles.length){
                System.out.printf("%s прошел все препятствия%n%n%n",participant.getName());
            }
        }
    }
}
