public class Engagement {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        FireController fireController = new FireController();
        Munition munition = new Munition();

        State openValve = new OpenValve(launcher,fireController,munition);
        State reversible = new Reversible(launcher, fireController, munition);
        State irreversible = new Irreversible(launcher, fireController, munition);
        State liftOff = new LiftOff(launcher, fireController, munition);

        launcher.process(openValve);
        fireController.process(openValve);
        munition.process(openValve);

        launcher.process(reversible);
        fireController.process(reversible);
        munition.process(reversible);

        launcher.process(irreversible);
        fireController.process(irreversible);
        munition.process(irreversible);

        launcher.process(liftOff);
        fireController.process(liftOff);
        munition.process(liftOff);
    }
}
