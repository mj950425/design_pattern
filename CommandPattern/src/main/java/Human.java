public class Human {
    public static void main(String[] args) {
        AirConditional airConditional = new AirConditional();
        Refrigerator refrigerator = new Refrigerator();
        RemoteController remoteController = new RemoteController();

        remoteController.addCommand(CommandCode.ON_COMMAND, new OnCommand());
        remoteController.addCommand(CommandCode.OFF_COMMAND, new OffCommand());

        remoteController.changeDevice(airConditional);

        remoteController.execute(CommandCode.ON_COMMAND);
        remoteController.execute(CommandCode.OFF_COMMAND);

        remoteController.changeDevice(refrigerator);

        remoteController.execute(CommandCode.ON_COMMAND);
        remoteController.execute(CommandCode.OFF_COMMAND);
    }
}
