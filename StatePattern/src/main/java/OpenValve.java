public class OpenValve implements State {
    private Launcher launcher;
    private FireController fireController;
    private Munition munition;

    private OpenValve() {
    }

    public OpenValve(Launcher launcher, FireController fireController, Munition munition) {
        this.launcher = launcher;
        this.fireController = fireController;
        this.munition = munition;
    }

    @Override
    public void process(State state) {
        System.out.println("open valve");

    }
}
