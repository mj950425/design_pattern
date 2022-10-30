public class OffCommand implements Command{

    @Override
    public void execute(Device device) {
        device.off();
    }
}
