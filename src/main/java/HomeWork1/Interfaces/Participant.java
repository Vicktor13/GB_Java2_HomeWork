package HomeWork1.Interfaces;

public interface Participant extends Runner, Jumper{


    String getName();
    @Override
    default int jump() {

        return 0;
    }

    @Override
    default int run() {

        return 0;
    }
}
