public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void end() {
        System.out.println("Cricket Game Finished!");
    }
}
