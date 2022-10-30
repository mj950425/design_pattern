import java.util.HashMap;
import java.util.Map;

public class RemoteController {

    private Device currentDevice;

    public void changeDevice(Device device) {
        this.currentDevice = device;
    }
    private Map<CommandCode,Command> commandMap = new HashMap();

    public void addCommand(CommandCode code, Command command) {
        commandMap.put(code, command);
    }
    public void execute(CommandCode code) {
        Command command = commandMap.get(code);
        command.execute(currentDevice);
    }
}
