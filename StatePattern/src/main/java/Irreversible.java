public class Irreversible implements State {
    private Launcher launcher;
    private FireController fireController;
    private Munition munition;

    public Irreversible(Launcher launcher, FireController fireController, Munition munition) {
        this.launcher = launcher;
        this.fireController = fireController;
        this.munition = munition;
    }

    @Override
    public void process(State state) {
        System.out.println("irreversible");
    }
}
