public class OnCommand implements Command{
    @Override
    public void execute(Device device) {
        device.on();
    }
}
